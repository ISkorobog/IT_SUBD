package com.example;

import java.io.BufferedWriter;
import java.io.Console;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.util.Pair;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.example.serviceimpl.Base;
import com.example.serviceimpl.CharField;
import com.example.serviceimpl.ColorField;
import com.example.serviceimpl.ColorInvlField;
import com.example.serviceimpl.FieldTypes;
import com.example.serviceimpl.IntField;
import com.example.serviceimpl.RealField;
import com.example.serviceimpl.StringField;
import com.example.serviceimpl.Table;

@WebService(endpointInterface = "com.example.interfaceq")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class serviceimpl implements interfaceq {
    public static Base CurrentBase;
    public static boolean IsChanged = false;
    public static Table CurrentTable;
@WebMethod
public void OpenNew()
{
    CurrentBase = new Base();
    CurrentTable = null;
    IsChanged = true;

}

@WebMethod
public int OpenBase(String Path)
{
    try
    {
        String np = Path;
        Path = "Files/" + Path;
        File myObj = new File(Path);
        Scanner myReader = new Scanner(myObj);
        {
            Base NewBase = new Base();
            NewBase.Path = np;
            String line;
            line = myReader.nextLine();
            int n=Integer.parseInt(line);
            for (int i = 0; i < n; i++)
            {
                String TableName = myReader.nextLine();
                ArrayList<Pair<String, String>> args = new ArrayList<Pair<String, String>>();
                line = myReader.nextLine();
                int m;
                m=Integer.parseInt(line);
                for (int j = 0; j < m; j++)
                {
                    line = myReader.nextLine();
                    String Type = myReader.nextLine();
                    args.add(new Pair<String, String>(line, Type));
                    StringField f;
                    switch (Type)
                    {
                        case "Int":
                            f = new IntField(line);
                            break;
                        case "Real":
                            f = new IntField(line);
                            break;
                        case "Char":
                            f = new IntField(line);
                            break;
                        case "String":
                            f = new IntField(line);
                            break;
                        case "Color":
                            f = new IntField(line);
                            break;
                        case "ColorInterval":
                            f = new IntField(line);
                            break;
                        default:
                            return 2;
                    }
                }
                Table t = new Table(TableName, args);
                int l;
                line = myReader.nextLine();
                l=Integer.parseInt(line);
                for (int j = 0; j < m; j++)
                {
                    for (int k = 0; k < l; k++)
                    {
                        line = myReader.nextLine();
                        t.Fields.get(j).addRow();
                        if (t.Fields.get(j).ChangeValue(k, line) != 0) { return 2; }
                    }
                }
                NewBase.Tables.add(t);
            }
            CurrentBase = NewBase;
            CurrentTable = null;
            IsChanged = false;
        }
        return 0;
    }
    catch (Exception ex)
    {
        System.out.println(ex.getMessage());
        return 1;
    }
}
@WebMethod
public boolean BaseOpened()
{
    return (CurrentBase != null);
}
@WebMethod
public boolean TableOpened()
{
    return (CurrentTable != null);
}
@WebMethod
public int RowsInTable()
{
    try
    {
        return CurrentTable.Fields.get(0).Values.size();
    }
    catch (Exception ex)
    {
        return -1;
    }
}
@WebMethod
public int ColumnsInTable()
{
    try
    {
        return CurrentTable.Fields.size();
    }
    catch (Exception ex)
    {
        return -1;
    }
}

@WebMethod
public String GetNameInCurrentTable(int i)
{
    try
    {
        return CurrentTable.Fields.get(i).Name;
    }
    catch (Exception ex)
    {
        return "ERR";
    }
}
@WebMethod
public String GetTypeInCurrentTable(int i)
{
    try
    {
        return CurrentTable.Fields.get(i).Type.toString();
    }
    catch (Exception ex)
    {
        return "ERR";
    }
}
@WebMethod
public String GetValueInTable(int i, int j)
{
    try
    {
        return CurrentTable.Fields.get(i).Values.get(j);
    }
    catch (Exception ex)
    {
        return "ERR";
    }
}
@WebMethod
public int GetNumberOfTables()
{
    try
    {
        return CurrentBase.Tables.size();
    }
    catch (Exception ex)
    {
        return -1;
    }
}
@WebMethod
public int GetNumberOfFieldsInTable(int i)
{
    try
    {
        return CurrentBase.Tables.get(i).Fields.size();
    }
    catch (Exception ex)
    {
        return -1;
    }
}
@WebMethod
public String GetTableName(int i)
{
    try
    {
        return CurrentBase.Tables.get(i).Name;
    }
    catch (Exception ex)
    {
        return "ERR";
    }
}
@WebMethod
public String GetCurrentTableName()
{
    try
    {
        return CurrentTable.Name;
    }
    catch (Exception ex)
    {
        return "ERR";
    }
}
@WebMethod
public String GetNameInTable(int i, int j)
{
    try
    {
        return CurrentBase.Tables.get(i).Fields.get(j).Name;
    }
    catch (Exception ex)
    {
        return "ERR";
    }
}
@WebMethod
public String GetTypeInTable(int i, int j)
{
    try
    {
        return CurrentBase.Tables.get(i).Fields.get(j).Type.toString();
    }
    catch (Exception ex)
    {
        return "ERR";
    }
}
@WebMethod
public int ChangeCurrentTable(int i)
{
    try
    {
        CurrentTable = CurrentBase.Tables.get(i);
        return 1;
    }
    catch (Exception ex)
    {
        return -1;
    }
}
@WebMethod
public boolean BaseHasPath()
{
    try
    {
        return CurrentBase.Path != "";
    }
    catch (Exception ex)
    {
        return false;
    }
}
@WebMethod
public boolean Changed()
{
    return IsChanged;
}
@WebMethod
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

@WebMethod
public String getAllFiles()
{
        File folder = new File("Files");
        File[] listOfFiles = folder.listFiles();
        String ans = "";
        ArrayList<String> filesEntries = new ArrayList<>();
        for (int i = 0; i < listOfFiles.length; i++) {
  if (listOfFiles[i].isFile()) {
    filesEntries.add(listOfFiles[i].getName());
  }
}
        /*ArrayList<String> fileEntries = new ArrayList<>();
        for(int i=0; i<filesEntries.size();i++)
    {
        System.out.println(filesEntries.get(i));
        String[] q=filesEntries.get(i).split("\\");
        System.out.print(q);
        fileEntries.add(q[q.length-1] );
    }*/
        ans = String.join("\n", filesEntries);
        return ans;
    
}

@WebMethod
public int SaveAs(String Path)
{
    try
    {
        //System.out.println("Working Directory = " + System.getProperty("user.dir"));
        Path = "Files/" + Path;
        File myObj = new File(Path);
        myObj.createNewFile();

        CurrentBase.Path = Path;
        FileWriter myWriter = new FileWriter(Path);
        myWriter.write(Integer.toString(CurrentBase.Tables.size())+"\n" );
        for (Table t : CurrentBase.Tables)
        {
            myWriter.write(t.Name+"\n");
            myWriter.write(Integer.toString(t.Fields.size())+"\n");
            for(StringField f : t.Fields)
            {
                myWriter.write(f.Name+"\n");
                myWriter.write(f.Type.toString()+"\n");
            }
            myWriter.write(t.Fields.get(0).Values.size()+"\n");
            for(StringField f : t.Fields)
            {
                for (String s : f.Values)
                {
                    myWriter.write(s+"\n");
                }
            }
        }
        myWriter.close();
        IsChanged = false;
        return 0;
    }
    catch (Exception ex)
    {
        System.out.println(ex.getMessage());
        return 1;
    }
}

@WebMethod
public int CreateTable(String Name, String[] arrNames, String[] arrTypes)
{
    for (Table t : CurrentBase.Tables)
    {
        if (t.Name.equals(Name)) return 1;
    }
    ArrayList<String> Names = new ArrayList<>(Arrays.asList(arrNames) );
    ArrayList<String> Types = new ArrayList<>(Arrays.asList(arrTypes) );
    ArrayList<Pair<String,String>> NamesTypes = new ArrayList<>();
    for (int i = 0; i < Names.size(); i++)
    {
        NamesTypes.add(new Pair<String, String>(Names.get(i), Types.get(i)));
    }
    CurrentBase.Tables.add(new Table(Name, NamesTypes));
    IsChanged = true;
    return 0;
}
@WebMethod
public int OpenTable(String Name)
{
    for (Table t : CurrentBase.Tables)
    {
        if (t.Name.equals(Name))
        {
            CurrentTable = t;
            return 0;
        }
    }
    return 1;
}

@WebMethod
public int DeleteTable(String Name)
{
    for (Table t : CurrentBase.Tables) if (t.Name.equals(Name)) { CurrentBase.Tables.remove(t); if (CurrentTable == t) CurrentTable = null; IsChanged = true; return 0; }
    return 1;
}
@WebMethod
public void AddRow()
{
    CurrentTable.AddRow();
    IsChanged = true;
}
@WebMethod
public int DeleteRows(int PosRow, int num)
{
    if (CurrentTable.Fields.get(0).Values.size() < PosRow + num) return 1;
    for (StringField f : CurrentTable.Fields)
    {
        for(int j=0;j<num;j++){
        f.Values.remove(PosRow);}
    }
    return 0;
}
@WebMethod
public int ChangeRowValue(int RowPos, int ColumnPos, String value)
{
    IsChanged = true;
    return CurrentTable.Fields.get(ColumnPos).ChangeValue(RowPos, value);
}
@WebMethod
public String GetPath()
{
    return CurrentBase.Path;
}

@WebMethod
public int Union(String name, ArrayList<String> Inputargs)
{
    if (CurrentBase == null) return 1;
    if (name.length() == 0) return 2;
    for (Table t : CurrentBase.Tables) if (t.Name.equals(name)) { return 3; }
    if (Inputargs.size() == 0) return 4;
    ArrayList<Table> Tablesargs = new ArrayList<>();

    for (String s : Inputargs)
    {
        boolean exists = false;
        for (Table t : CurrentBase.Tables) if (t.Name.equals(s)) { exists = true; Tablesargs.add(t); break; }
        if (!exists) return 6;
    }
    for (int i = 0; i < Tablesargs.size() - 1; i++)
    {
        HashSet<Pair<String, String>> h1 = Tablesargs.get(i).FieldsSet();
        boolean ex = true;
        while (ex)
        {
            ex = false;
            for (Pair<String, String> t1 : h1) for (Pair<String, String> t2 : h1) if (t1 != t2 && t1.equals(t2)) { ex = true; h1.remove(t2); }
        }
        HashSet<Pair<String, String>> h2 = Tablesargs.get(i+1).FieldsSet();
        ex = true;
        while (ex)
        {
            ex = false;
            for (Pair<String, String> t1 : h2) for (Pair<String, String> t2 : h2) if (t1 != t2 && t1.equals(t2)) { ex = true; h2.remove(t2); }
        }
        if (h1.size() != h2.size()) return 7;
        for (Pair<String, String> t1 : h1)
        {
            boolean exists = false;
            for (Pair<String, String> t2 : h2) { if (t1.equals(t2)) { exists = true; break; } }
            if (!exists) return 7;
        }
    }
    ArrayList<Pair<String, String>> NamesTypes = new ArrayList<>(Tablesargs.get(0).FieldsSet());
    Dictionary<String, Integer> pos = new Hashtable<>();
    for (int i = 0; i < NamesTypes.size(); i++) pos.put(NamesTypes.get(i).getKey(), i);
    Table newTable = new Table(name, NamesTypes);
    ArrayList<String[]> Rows = new ArrayList<>();
    for (Table t : Tablesargs)
    {

        for (int i = 0; i < t.Fields.get(0).Values.size(); i++)
        {
            String[] Row = new String[NamesTypes.size()];
            for (StringField f : t.Fields)
            {
                Row[pos.get(f.Name)] = (f.Values.get(i));
            }
            boolean exists = false;
            for (String[] r : Rows){ 
                boolean eq=true;
                for(int w=0;w<r.length;w++)if(!r[w].equals(Row[w])){eq=false; break;}
                if (eq) { exists = true; break; }}
            if (exists) continue;
            for (int j = 0; j < t.Fields.size(); j++)
            {
                newTable.Fields.get(j).Values.add(Row[j]);
            }
            Rows.add(Row);
        }
    }
    CurrentBase.Tables.add(newTable);
    IsChanged = true;
    return 0;
}
@WebMethod
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




    public class Base
{
    public ArrayList<Table> Tables;
    public String Path;
    public Base()
    {
        Tables = new ArrayList<Table>();
        Path = "";
    }
}
public class Table
{
    public ArrayList<StringField> Fields;
    public String Name;
    public Table(String NameVal, ArrayList<Pair<String, String>> NamesTypes)
    {
        Name = NameVal;
        Fields = new ArrayList<StringField>();
        for (Pair<String, String> nametype : NamesTypes)
        {
            switch (nametype.getValue() )
            {
                case "Int":
                    Fields.add(new IntField(nametype.getKey() ));
                    break;
                case "Real":
                    Fields.add(new RealField(nametype.getKey()));
                    break;
                case "Char":
                    Fields.add(new CharField(nametype.getKey()));
                    break;
                case "String":
                    Fields.add(new StringField(nametype.getKey()));
                    break;
                case "Color":
                    Fields.add(new ColorField(nametype.getKey()));
                    break;
                case "ColorInterval":
                    Fields.add(new ColorInvlField(nametype.getKey()));
                    break;
            }
        }

    }
    public void AddRow()
    {
        for (StringField f : Fields) f.addRow();
    }
    public HashSet<Pair<String, String>> FieldsSet()
    {
        HashSet<Pair<String, String>> ans = new HashSet<Pair<String, String>>();
        for (StringField f : Fields) ans.add(new Pair<String, String>(f.Name, f.Type.toString() ));
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
    public String Name;
    public FieldTypes Type;
    public ArrayList<String> Values = new ArrayList<>();
    public StringField(String NameVal)
    {
        Name = NameVal;
        Type = FieldTypes.String;
    }
    public void addRow()
    {
        Values.add("");
    }
    public int ChangeValue(int Pos, String Value)
    {
        if (Pos >= Values.size() || Pos < 0)
        {
            return 2;
        }
        Values.set(Pos, Value);
        return 0;
    }
}

public class IntField extends StringField
{
    public IntField(String NameVal)
    {
        super(NameVal);
        Type = FieldTypes.Int;
    }
    public int ChangeValue(int Pos, String Value)
    {
        if (Value.length() == 0) return 0;
        if (Pos >= Values.size() || Pos < 0)
        {
            return 2;
        }
        int n;
        try{
            n=Integer.parseInt(Value);
            Values.set(Pos, Value);
            return 0;
        }
        catch(Exception e){
            return 1;
        }
    }
}
public class RealField extends StringField
{
    public RealField(String NameVal)
    {
        super(NameVal);
        Type = FieldTypes.Real;
    }
    public int ChangeValue(int Pos, String Value)
    {
        if (Value.length() == 0) return 0;
        if (Pos >= Values.size() || Pos < 0)
        {
            return 2;
        }
        double n;
        try{
            n=Double.parseDouble(Value);
            Values.set(Pos, Value);
            return 0;
        }
        catch(Exception e){
            return 1;
        }
    }
}
public class CharField extends StringField
{
    public CharField(String NameVal)
    {
        super(NameVal);
        Type = FieldTypes.Char;
    }
    public int ChangeValue(int Pos, String Value)
    {
        if (Value.length() == 0) return 0;
        if (Pos >= Values.size() || Pos < 0)
        {
            return 2;
        }
        char n;
        if (Value.length()==1)
        {
            Values.set(Pos, Value);
            return 0;
        }
        return 1;
    }
}
public class ColorField extends StringField
{
    public ColorField(String NameVal) 
    {
        super(NameVal);
        Type = FieldTypes.Color;
    }
    public int ChangeValue(int Pos, String Value)
    {
        if (Value.length() == 0) return 0;
        if (Pos >= Values.size() || Pos < 0)
        {
            return 2;
        }
        if (Value.length() != 7) return 1;
        Pattern pattern = Pattern.compile("#[0-9a-fA-F]{6}");
        Matcher matcher = pattern.matcher(Value);
        if (matcher.find())
        {
            Values.set(Pos, Value);
            return 0;
        }
        return 1;
    }
}
public class ColorInvlField extends StringField
{
    public ColorInvlField(String NameVal)
    {
        super(NameVal);
        Type = FieldTypes.ColorInterval;
    }
    public int ChangeValue(int Pos, String Value)
    {
        if (Value.length() == 0) return 0;
        if (Pos >= Values.size() || Pos < 0)
        {
            return 2;
        }
        if (Value.length() != 15) return 1;
        Pattern pattern = Pattern.compile("#[0-9a-fA-F]{6}-#[0-9a-fA-F]{6}");
        Matcher matcher = pattern.matcher(Value);
        if (matcher.find())
        {
            String s1 = Value.substring(1,6).toUpperCase();
            String s2 = Value.substring(9, 14).toUpperCase();
            for (int i = 0; i < 6; i++)
            {
                if (s1.charAt(i) < s2.charAt(i)) break;
                if (s1.charAt(i) > s2.charAt(i)) return 2;
            }
            Values.set(Pos, Value);
            return 0;
        }
        return 1;
    }
}
}
    

