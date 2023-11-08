using System.Collections.Generic;
using System;
using System.IO;
using System.Text.RegularExpressions;
using System.Xml.Linq;
using System.Linq;
using MongoDB.Bson;
using MongoDB.Bson.Serialization.Attributes;
using MongoDB.Driver;
using MongoDB.Driver.Core.Configuration;

namespace SUBDLab
{
    public class DBMenu
    {
        public Base CurrentBase;
        public bool IsChanged;
        public Table CurrentTable;
        string connectionUri = "mongodb+srv://igor:12345@subd.2e7zo8o.mongodb.net/?retryWrites=true&w=majority";

        MongoClient client;
        public DBMenu()
        {
            IsChanged = false;
            //settings= MongoClientSettings.FromConnectionString(connectionUri);
            //settings.ServerApi = new ServerApi(ServerApiVersion.V1);
            client = new MongoClient(connectionUri);

        }
        public void OpenNew()
        {
            CurrentBase = new Base();
            CurrentTable = null;
            IsChanged = true;

        }
        public int OpenBase(string Path)
        {
            try
            {
                IMongoDatabase db = client.GetDatabase(Path);
                IMongoCollection<Table> col= db.GetCollection<Table>("tables");

             
                    Base NewBase = new Base();
                    NewBase.Path= Path;
                    var filter = Builders<Table>.Filter.Empty;
                    NewBase.Tables = col.Find(filter).Project<Table>("{_id: 0}").ToList();
                    CurrentBase = NewBase;
                    CurrentTable = null;
                    IsChanged = false;
                
                return 0;
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
                return 1;
            }
        }
        public int Save()
        {
            if (CurrentBase == null)
            {
                return 1;
            }
            SaveAs(CurrentBase.Path);
            IsChanged = false;
            return 0;
        }
        public int SaveAs(string Path)
        {
                
                IMongoDatabase db = client.GetDatabase(Path);
            client.DropDatabase(Path);
            db = client.GetDatabase(Path);
            IMongoCollection<Table> col= db.GetCollection<Table>("tables");
            if (CurrentBase.Tables.Count > 0)
            {
                col.InsertMany(CurrentBase.Tables);
            }

                CurrentBase.Path = Path;
                IsChanged = false;
                return 0;
        }
        public int CreateTable(string Name, List<Tuple<string, string>> NamesTypes)
        {
            foreach (Table t in CurrentBase.Tables)
            {
                if (t.Name.Equals(Name)) return 1;
            }
            CurrentBase.Tables.Add(new Table(Name, NamesTypes));
            IsChanged = true;
            return 0;
        }
        public int OpenTable(string Name)
        {
            foreach(Table t in CurrentBase.Tables)
            {
                if (t.Name.Equals(Name))
                {
                    CurrentTable = t;
                    return 0;
                }
            }
            return 1;
        }
        public string getAllFiles()
        {
            try
            {
                var databases = client.ListDatabaseNames();
                List<string> dblist = new List<string>();
                databases.ForEachAsync(s => dblist.Add(s));
                string ans = String.Join("\n", dblist);
                return ans;
            }
            catch (System.Exception ex)
            {
                return "ERR";
            }
        }
        public int DeleteTable(string Name)
        {
            foreach(Table t in CurrentBase.Tables) if (t.Name.Equals(Name)) { CurrentBase.Tables.Remove(t); if (CurrentTable == t) CurrentTable = null; IsChanged = true; return 0; }
            return 1;
        }
        public void AddRow()
        {
            CurrentTable.AddRow();
            IsChanged = true;
        }
        public int DeleteRows(int PosRow,int num)
        {
            if (CurrentTable.Fields[0].Values.Count < PosRow + num) return 1;
            foreach (StringField f in CurrentTable.Fields)
            {
                f.Values.RemoveRange(PosRow, num);
            }
            return 0;
        }
        public int ChangeRowValue(int RowPos,int ColumnPos,string value)
        {
            IsChanged = true;
            return CurrentTable.Fields[ColumnPos].ChangeValue(RowPos, value);
        }
        public int Union(string name,List<string> Inputargs)
        {
            if (CurrentBase == null) return 1;
            if (name.Length == 0) return 2;
            foreach(Table t in CurrentBase.Tables)if(t.Name.Equals(name)) { return 3; }
            if (Inputargs.Count == 0) return 4;
            /*foreach(string s1 in Inputargs)foreach(string s2 in Inputargs)
                {
                    if (s1 != s2 && s1.Equals(s2)) return 5;
                }*/
            List<Table> Tablesargs = new List<Table>();

            foreach(string s in Inputargs)
            {
                bool exists = false;
                foreach(Table t in CurrentBase.Tables) if (t.Name.Equals(s)) { exists = true; Tablesargs.Add(t); break; }
                if (!exists) return 6;
            }
            for (int i = 0; i < Tablesargs.Count - 1; i++)
            {
                HashSet<Tuple<string, string>> h1 = Tablesargs[i].FieldsSet();
                bool ex = true;
                while (ex)
                {
                    ex = false;
                    foreach (Tuple<string, string> t1 in h1) foreach (Tuple<string, string> t2 in h1) if (t1 != t2 && t1.Equals(t2)) { ex = true; h1.Remove(t2); }
                }
                HashSet<Tuple<string, string>> h2 = Tablesargs[i+1].FieldsSet();
                ex = true;
                while (ex)
                {
                    ex = false;
                    foreach (Tuple<string, string> t1 in h2) foreach (Tuple<string, string> t2 in h2) if (t1 != t2 && t1.Equals(t2)) { ex = true; h2.Remove(t2); }
                }
                if (h1.Count != h2.Count) return 7;
                foreach (Tuple<string, string> t1 in h1)
                {
                    bool exists = false;
                    foreach (Tuple<string, string> t2 in h2) { if (t1.Equals(t2)) { exists = true; break; } }
                    if (!exists) return 7;
                }
            }
            List<Tuple<string, string>> NamesTypes = Tablesargs[0].FieldsSet().ToList();
            Dictionary<string, int> pos = new Dictionary<string, int>();
            for (int i = 0; i < NamesTypes.Count; i++) pos.Add(NamesTypes[i].Item1, i);
            Table newTable = new Table(name, NamesTypes);
            List<List<string>> Rows = new List<List<string>>();
            foreach(Table t in Tablesargs)
            {

                for (int i = 0; i < t.Fields[0].Values.Count;i++)
                {
                    List<string> Row=new List<string>(new string[NamesTypes.Count]);
                    foreach (StringField f in t.Fields)
                    {
                        Row[pos[f.Name]]=(f.Values[i]);
                    }
                    bool exists = false;
                    foreach (List<string> r in Rows) if (r.SequenceEqual(Row)) { exists = true; break; }
                    if (exists) continue;
                    for(int j=0;j<t.Fields.Count;j++)
                    {
                        newTable.Fields[j].Values.Add(Row[j]);
                    }
                    Rows.Add(Row);
                }
            }
            CurrentBase.Tables.Add(newTable);
            IsChanged = true;
            return 0;
        }
        public void Close()
        {
            if (CurrentTable == null)
            {
                CurrentBase = null;
                IsChanged = false;
            }
            else
                CurrentTable = null;

        }
    }
    public class Base
    {
        public List<Table> Tables;
        public string Path;
        public Base()
        {
            Tables = new List<Table>();
        }
    }
    public class Table
    {
        public List<StringField> Fields;
        public string Name;
        public Table(string NameVal, List<Tuple<string, string>> NamesTypes)
        {
            Name = NameVal;
            Fields = new List<StringField>();
            foreach (Tuple<string, string> nametype in NamesTypes)
            {
                switch (nametype.Item2)
                {
                    case "Int":
                        Fields.Add(new IntField(nametype.Item1));
                        break;
                    case "Real":
                        Fields.Add(new RealField(nametype.Item1));
                        break;
                    case "Char":
                        Fields.Add(new CharField(nametype.Item1));
                        break;
                    case "String":
                        Fields.Add(new StringField(nametype.Item1));
                        break;
                    case "Color":
                        Fields.Add(new ColorField(nametype.Item1));
                        break;
                    case "ColorInterval":
                        Fields.Add(new ColorInvlField(nametype.Item1));
                        break;
                }
            }
        
        }
        public void AddRow()
        {
            foreach (StringField f in Fields) f.addRow();
        }
        public HashSet<Tuple<string,string>> FieldsSet()
        {
            HashSet<Tuple<string,string>> ans= new HashSet<Tuple<string,string>>();
            foreach (StringField f in Fields) ans.Add(new Tuple<string, string>(f.Name, f.Type.ToString()));
            return ans;
        }
    }
    public enum FieldTypes
    {
        Int,
        Real,
        Char,
        String,
        Color,
        ColorInterval
    }
    public class StringField
    {
        public string Name;
        public FieldTypes Type;
        public List<string> Values=new List<string>();
        public StringField(string NameVal)
        {
            Name = NameVal;
            Type = FieldTypes.String;
        }
        public void addRow()
        {
            Values.Add("");
        }
        public virtual int ChangeValue(int Pos, string Value)
        {
            if (Pos >= Values.Count || Pos < 0)
            {
                return 2;
            }
            Values[Pos] = Value;
            return 0;
        }
    }
    public class IntField : StringField
    {
        public IntField(string NameVal) : base(NameVal)
        {
            Type = FieldTypes.Int;
        }
        public override int ChangeValue(int Pos, string Value)
        {
            if (Value.Length == 0) return 0;
            if (Pos >= Values.Count || Pos < 0)
            {
                return 2;
            }
            int n;
            if (int.TryParse(Value, out n))
            {
                Values[Pos] = Value;
                return 0;
            }
            return 1;
        }
    }
    public class RealField : StringField
    {
        public RealField(string NameVal) : base(NameVal)
        {
            Type = FieldTypes.Real;
        }
        public override int ChangeValue(int Pos, string Value)
        {
            if (Value.Length == 0) return 0;
            if (Pos >= Values.Count || Pos < 0)
            {
                return 2;
            }
            double n;
            if (double.TryParse(Value, out n))
            {
                Values[Pos] = Value;
                return 0;
            }
            return 1;
        }
    }
    public class CharField : StringField
    {
        public CharField(string NameVal) : base(NameVal)
        {
            Type = FieldTypes.Char;
        }
        public override int ChangeValue(int Pos, string Value)
        {
            if (Value.Length == 0) return 0;
            if (Pos >= Values.Count || Pos < 0)
            {
                return 2;
            }
            char n;
            if (char.TryParse(Value, out n))
            {
                Values[Pos] = Value;
                return 0;
            }
            return 1;
        }
    }
    public class ColorField : StringField
    {
        public ColorField(string NameVal) : base(NameVal)
        {
            Type = FieldTypes.Color;
        }
        public override int ChangeValue(int Pos, string Value)
        {
            if (Value.Length == 0) return 0;
            if (Pos >= Values.Count || Pos < 0)
            {
                return 2;
            }
            if (Value.Length != 7) return 1;
            string pattern = "#[0-9a-fA-F]{6}";
            Match m = Regex.Match(Value, pattern);
            if (m.Success)
            {
                Values[Pos] = Value;
                return 0;
            }
            return 1;
        }
    }
    public class ColorInvlField : StringField
    {
        public ColorInvlField(string NameVal) : base(NameVal)
        {
            Type = FieldTypes.ColorInterval;
        }
        public override int ChangeValue(int Pos, string Value)
        {
            if (Value.Length == 0) return 0;
            if (Pos >= Values.Count || Pos < 0)
            {
                return 2;
            }
            if (Value.Length != 15) return 1;
            string pattern = "#[0-9a-fA-F]{6}-#[0-9a-fA-F]{6}";
            Match m = Regex.Match(Value, pattern);
            if (m.Success)
            {
                string s1 = Value.Substring(1, 6).ToUpper();
                string s2 = Value.Substring(9, 6).ToUpper();
                for(int i = 0; i < 6; i++)
                {
                    if (s1[i] < s2[i]) break;
                    if (s1[i] > s2[i]) return 2;
                }
                Values[Pos] = Value;
                return 0;
            }
            return 1;
        }
    }
}