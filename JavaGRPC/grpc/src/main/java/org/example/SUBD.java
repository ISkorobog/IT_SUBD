package org.example;

import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class SUBD extends SUBDServiceGRPCGrpc.SUBDServiceGRPCImplBase {
    public static Base CurrentBase;
    public static boolean IsChanged = false;
    public static Table CurrentTable;
    oneindex.Builder a=oneindex.newBuilder().setAr(1);
    @Override
    public void openNew(Empty request, StreamObserver<Empty> responseObserver) {
        Empty.Builder res=Empty.newBuilder();
        CurrentBase = new Base();
        CurrentTable = null;
        IsChanged = true;

        responseObserver.onNext(res.build());
        responseObserver.onCompleted();
    }

    @Override
    public void openBase(onlystring request, StreamObserver<oneindex> responseObserver) {
        oneindex.Builder res=oneindex.newBuilder();
        try
        {

            String Path=request.getAr();
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
                    ArrayList<String> args1 = new ArrayList<String>();
                    ArrayList<String> args2 = new ArrayList<String>();
                    line = myReader.nextLine();
                    int m;
                    m=Integer.parseInt(line);
                    for (int j = 0; j < m; j++)
                    {
                        line = myReader.nextLine();
                        String Type = myReader.nextLine();
                        args1.add(line);
                        args2.add(Type);
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
                                res.setAr(2);
                                responseObserver.onNext(res.build());
                                responseObserver.onCompleted();
                        }
                    }
                    Table t = new Table(TableName, args1,args2);
                    int l;
                    line = myReader.nextLine();
                    l=Integer.parseInt(line);
                    for (int j = 0; j < m; j++)
                    {
                        for (int k = 0; k < l; k++)
                        {
                            line = myReader.nextLine();
                            t.Fields.get(j).addRow();
                            if (t.Fields.get(j).ChangeValue(k, line) != 0) {
                                res.setAr(2);
                                responseObserver.onNext(res.build());
                                responseObserver.onCompleted(); }
                        }
                    }
                    NewBase.Tables.add(t);
                }
                CurrentBase = NewBase;
                CurrentTable = null;
                IsChanged = false;
            }
            res.setAr(0);
            responseObserver.onNext(res.build());
            responseObserver.onCompleted();
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
            res.setAr(1);
            responseObserver.onNext(res.build());
            responseObserver.onCompleted();
        }
    }

    @Override
    public void baseOpened(Empty request, StreamObserver<logical> responseObserver) {
        logical.Builder res=logical.newBuilder();
        res.setAns(CurrentBase != null);
        responseObserver.onNext(res.build());
        responseObserver.onCompleted();
    }

    @Override
    public void tableOpened(Empty request, StreamObserver<logical> responseObserver) {
        logical.Builder res=logical.newBuilder();
        res.setAns(CurrentTable != null);
        responseObserver.onNext(res.build());
        responseObserver.onCompleted();
    }

    @Override
    public void rowsInTable(Empty request, StreamObserver<oneindex> responseObserver) {
        oneindex.Builder res=oneindex.newBuilder();
        try
        {
            res.setAr(CurrentTable.Fields.get(0).Values.size());
            responseObserver.onNext(res.build());
            responseObserver.onCompleted();
        }
        catch (Exception ex)
        {
            res.setAr(-1);
            responseObserver.onNext(res.build());
            responseObserver.onCompleted();
        }
    }

    @Override
    public void columnsInTable(Empty request, StreamObserver<oneindex> responseObserver) {
        oneindex.Builder res=oneindex.newBuilder();
        try
        {
            res.setAr(CurrentTable.Fields.size());
            responseObserver.onNext(res.build());
            responseObserver.onCompleted();
        }
        catch (Exception ex)
        {
            res.setAr(-1);
            responseObserver.onNext(res.build());
            responseObserver.onCompleted();
        }
    }

    @Override
    public void getNameInCurrentTable(oneindex request, StreamObserver<onlystring> responseObserver) {
        onlystring.Builder res=onlystring.newBuilder();
        try
        {
            res.setAr(CurrentTable.Fields.get(request.getAr()).Name);
            responseObserver.onNext(res.build());
            responseObserver.onCompleted();
        }
        catch (Exception ex)
        {
            res.setAr("ERR");
            responseObserver.onNext(res.build());
            responseObserver.onCompleted();
        }
    }

    @Override
    public void getTypeInCurrentTable(oneindex request, StreamObserver<onlystring> responseObserver) {
        onlystring.Builder res=onlystring.newBuilder();
        try
        {
            res.setAr(CurrentTable.Fields.get(request.getAr()).Type.toString());
            responseObserver.onNext(res.build());
            responseObserver.onCompleted();
        }
        catch (Exception ex)
        {
            res.setAr("ERR");
            responseObserver.onNext(res.build());
            responseObserver.onCompleted();
        }

    }

    @Override
    public void getValueInTable(twoindex request, StreamObserver<onlystring> responseObserver) {
        onlystring.Builder res=onlystring.newBuilder();
        try
        {
            res.setAr(CurrentTable.Fields.get(request.getAr1()).Values.get(request.getAr2()));
            responseObserver.onNext(res.build());
            responseObserver.onCompleted();
        }
        catch (Exception ex)
        {
            res.setAr("ERR");
            responseObserver.onNext(res.build());
            responseObserver.onCompleted();
        }
    }

    @Override
    public void getNumberOfTables(Empty request, StreamObserver<oneindex> responseObserver) {
        oneindex.Builder res=oneindex.newBuilder();try
        {
            res.setAr(CurrentBase.Tables.size());
            responseObserver.onNext(res.build());
            responseObserver.onCompleted();
        }
        catch (Exception ex)
        {
            res.setAr(-1);
            responseObserver.onNext(res.build());
            responseObserver.onCompleted();
        }

    }

    @Override
    public void getNumberOfFieldsInTable(oneindex request, StreamObserver<oneindex> responseObserver) {
        oneindex.Builder res=oneindex.newBuilder();
        try
        {
            res.setAr(CurrentBase.Tables.get(request.getAr()).Fields.size());
            responseObserver.onNext(res.build());
            responseObserver.onCompleted();
        }
        catch (Exception ex)
        {
            res.setAr(-1);
            responseObserver.onNext(res.build());
            responseObserver.onCompleted();
        }
    }

    @Override
    public void getTableName(oneindex request, StreamObserver<onlystring> responseObserver) {
        onlystring.Builder res=onlystring.newBuilder();
        try
        {
            res.setAr(CurrentBase.Tables.get(request.getAr()).Name);
            responseObserver.onNext(res.build());
            responseObserver.onCompleted();
        }
        catch (Exception ex)
        {
            res.setAr("ERR");
            responseObserver.onNext(res.build());
            responseObserver.onCompleted();
        }
    }

    @Override
    public void getCurrentTableName(Empty request, StreamObserver<onlystring> responseObserver) {
        onlystring.Builder res=onlystring.newBuilder();
        try
        {
            res.setAr(CurrentTable.Name);
            responseObserver.onNext(res.build());
            responseObserver.onCompleted();
        }
        catch (Exception ex)
        {
            res.setAr("ERR");
            responseObserver.onNext(res.build());
            responseObserver.onCompleted();
        }
    }

    @Override
    public void getNameInTable(twoindex request, StreamObserver<onlystring> responseObserver) {
        onlystring.Builder res=onlystring.newBuilder();
        try
        {
            res.setAr(CurrentBase.Tables.get(request.getAr1()).Fields.get(request.getAr2()).Name);
            responseObserver.onNext(res.build());
            responseObserver.onCompleted();
        }
        catch (Exception ex)
        {
            res.setAr("ERR");
            responseObserver.onNext(res.build());
            responseObserver.onCompleted();
        }
    }

    @Override
    public void getTypeInTable(twoindex request, StreamObserver<onlystring> responseObserver) {
        onlystring.Builder res=onlystring.newBuilder();
        try
        {
            res.setAr(CurrentBase.Tables.get(request.getAr1()).Fields.get(request.getAr2()).Type.toString());
            responseObserver.onNext(res.build());
            responseObserver.onCompleted();
        }
        catch (Exception ex)
        {
            res.setAr("ERR");
            responseObserver.onNext(res.build());
            responseObserver.onCompleted();
        }
    }

    @Override
    public void changeCurrentTable(oneindex request, StreamObserver<oneindex> responseObserver) {
        oneindex.Builder res=oneindex.newBuilder();
        try
        {
            CurrentTable = CurrentBase.Tables.get(request.getAr());
            res.setAr(1);
            responseObserver.onNext(res.build());
            responseObserver.onCompleted();
        }
        catch (Exception ex)
        {
            res.setAr(-1);
            responseObserver.onNext(res.build());
            responseObserver.onCompleted();
        }
    }

    @Override
    public void baseHasPath(Empty request, StreamObserver<logical> responseObserver) {
        logical.Builder res=logical.newBuilder();
        try
        {
            res.setAns(CurrentBase.Path != "");
            responseObserver.onNext(res.build());
            responseObserver.onCompleted();
        }
        catch (Exception ex)
        {
            res.setAns(false);
            responseObserver.onNext(res.build());
            responseObserver.onCompleted();
        }
    }

    @Override
    public void changed(Empty request, StreamObserver<logical> responseObserver) {
        logical.Builder res=logical.newBuilder();
        res.setAns(IsChanged);

        responseObserver.onNext(res.build());
        responseObserver.onCompleted();
    }

    @Override
    public void save(Empty request, StreamObserver<oneindex> responseObserver) {
        oneindex.Builder res=oneindex.newBuilder();
        if (CurrentBase == null)
        {
            res.setAr(1);
            responseObserver.onNext(res.build());
            responseObserver.onCompleted();
        }
        SaveAs(CurrentBase.Path);
        IsChanged = false;
        res.setAr(0);
        responseObserver.onNext(res.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getAllFiles(Empty request, StreamObserver<onlystring> responseObserver) {
        onlystring.Builder res=onlystring.newBuilder();
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
        res.setAr(ans);
        responseObserver.onNext(res.build());
        responseObserver.onCompleted();
    }

    @Override
    public void saveAs(onlystring request, StreamObserver<oneindex> responseObserver) {
        oneindex.Builder res=oneindex.newBuilder();
        try
        {
            //System.out.println("Working Directory = " + System.getProperty("user.dir"));
            String Path=request.getAr();
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
            res.setAr(0);
            responseObserver.onNext(res.build());
            responseObserver.onCompleted();
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
            res.setAr(1);
            responseObserver.onNext(res.build());
            responseObserver.onCompleted();
        }
    }
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

    @Override
    public void createTable(table request, StreamObserver<oneindex> responseObserver) {
        oneindex.Builder res=oneindex.newBuilder();
        for (Table t : CurrentBase.Tables)
        {
            if (t.Name.equals(request.getName())){ res.setAr(1);
                responseObserver.onNext(res.build());
                responseObserver.onCompleted();}
        }
        ArrayList<String> Names = new ArrayList<>();
        for(int i=0;i<request.getNamesCount();i++)Names.add(request.getNames(i));
        ArrayList<String> Types = new ArrayList<>();
        for(int i=0;i<request.getTypesCount();i++)Types.add(request.getTypes(i));
        CurrentBase.Tables.add(new Table(request.getName(), Names,Types));
        IsChanged = true;
        res.setAr(0);
        responseObserver.onNext(res.build());
        responseObserver.onCompleted();
    }

    @Override
    public void openTable(onlystring request, StreamObserver<oneindex> responseObserver) {
        oneindex.Builder res=oneindex.newBuilder();
        for (Table t : CurrentBase.Tables)
        {
            if (t.Name.equals(request.getAr()))
            {
                CurrentTable = t;
                res.setAr(0);
                responseObserver.onNext(res.build());
                responseObserver.onCompleted();
            }
        }
        res.setAr(1);
        responseObserver.onNext(res.build());
        responseObserver.onCompleted();
    }

    @Override
    public void deleteTable(onlystring request, StreamObserver<oneindex> responseObserver) {
        oneindex.Builder res=oneindex.newBuilder();
        for (Table t : CurrentBase.Tables) if (t.Name.equals(request.getAr())) { CurrentBase.Tables.remove(t); if (CurrentTable == t) CurrentTable = null; IsChanged = true; res.setAr(0);
            responseObserver.onNext(res.build());
            responseObserver.onCompleted(); }
        res.setAr(1);
        responseObserver.onNext(res.build());
        responseObserver.onCompleted();
    }

    @Override
    public void addRow(Empty request, StreamObserver<Empty> responseObserver) {
        Empty.Builder res=Empty.newBuilder();
        CurrentTable.AddRow();
        IsChanged = true;
        responseObserver.onNext(res.build());
        responseObserver.onCompleted();

    }

    @Override
    public void deleteRows(twoindex request, StreamObserver<oneindex> responseObserver) {
        oneindex.Builder res=oneindex.newBuilder();
        if (CurrentTable.Fields.get(0).Values.size() < request.getAr1() + request.getAr2()){res.setAr(1);
            responseObserver.onNext(res.build());
            responseObserver.onCompleted();}
        for (StringField f : CurrentTable.Fields)
        {
            for(int j=0;j<request.getAr2();j++){
                f.Values.remove(request.getAr1());}
        }
        res.setAr(0);
        responseObserver.onNext(res.build());
        responseObserver.onCompleted();
    }

    @Override
    public void changeRowValue(changevalue request, StreamObserver<oneindex> responseObserver) {
        oneindex.Builder res=oneindex.newBuilder();
        IsChanged = true;
        res.setAr(CurrentTable.Fields.get(request.getJ()).ChangeValue(request.getI(), request.getVal()));
        responseObserver.onNext(res.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getPath(Empty request, StreamObserver<onlystring> responseObserver) {
        onlystring.Builder res=onlystring.newBuilder();
        res.setAr(CurrentBase.Path);
        responseObserver.onNext(res.build());
        responseObserver.onCompleted();

    }

    @Override
    public void union(union request, StreamObserver<oneindex> responseObserver) {

        oneindex.Builder res=oneindex.newBuilder();
        if (CurrentBase == null){ res.setAr(1);
            responseObserver.onNext(res.build());
            responseObserver.onCompleted();}
        if (request.getName().length() == 0){res.setAr(2);
            responseObserver.onNext(res.build());
            responseObserver.onCompleted();}
        for (Table t : CurrentBase.Tables) if (t.Name.equals(request.getName())) { res.setAr(3);
            responseObserver.onNext(res.build());
            responseObserver.onCompleted(); }
        if (request.getArgsCount()== 0){res.setAr(4);
            responseObserver.onNext(res.build());
            responseObserver.onCompleted();}
        ArrayList<Table> Tablesargs = new ArrayList<>();
        for (int i=0;i<request.getArgsCount();i++)
        {
            boolean exists = false;
            for (Table t : CurrentBase.Tables) if (t.Name.equals(request.getArgs(i))) { exists = true; Tablesargs.add(t); break; }
            if (!exists){res.setAr(6);
                responseObserver.onNext(res.build());
                responseObserver.onCompleted();}
        }

        for (int i = 0; i < Tablesargs.size() - 1; i++)
        {

            ArrayList<String> h1 = Tablesargs.get(i).FieldsSet();
            boolean ex = true;
            ArrayList<String> h2 = Tablesargs.get(i+1).FieldsSet();
            if (h1.size() != h2.size()){res.setAr(7);
                responseObserver.onNext(res.build());
                responseObserver.onCompleted();}
            for (int j=0;j<h1.size()/2;j++)
            {
                boolean exists = false;
                for (int k=0;k<h2.size()/2;k++) { if (h1.get(2*j).equals(h2.get(2*k)) && h1.get(2*i+1).equals(h2.get(2*k+1))) { exists = true; break; } }
                if (!exists){res.setAr(7);
                    responseObserver.onNext(res.build());
                    responseObserver.onCompleted();}
            }
        }

        ArrayList<String> NamesTypes = (Tablesargs.get(0).FieldsSet());
        Dictionary<String, Integer> pos = new Hashtable<>();
        for (int i = 0; i < NamesTypes.size()/2; i++) pos.put(NamesTypes.get(2*i), i);
        ArrayList<String>N=new ArrayList<>();
        ArrayList<String>T=new ArrayList<>();
        for(int i=0;i<NamesTypes.size();i++){
            if(i%2==0)N.add(NamesTypes.get(i));
            else T.add(NamesTypes.get(i));
        }

        System.out.println(1);
        Table newTable = new Table(request.getName(), N,T);
        ArrayList<String[]> Rows = new ArrayList<>();
        for (Table t : Tablesargs)
        {
            System.out.println(2);

            for (int i = 0; i < t.Fields.get(0).Values.size(); i++)
            {
                String[] Row = new String[NamesTypes.size()/2];
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
        res.setAr(0);
        responseObserver.onNext(res.build());
        responseObserver.onCompleted();
    }

    @Override
    public void close(Empty request, StreamObserver<Empty> responseObserver) {
        Empty.Builder res=Empty.newBuilder();
        if (CurrentTable == null)
        {
            CurrentBase = null;
            IsChanged = false;
        }
        else
            CurrentTable = null;
        responseObserver.onNext(res.build());
        responseObserver.onCompleted();
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
    public class Table {
        public ArrayList<StringField> Fields;
        public String Name;

        public Table(String NameVal, ArrayList<String> Names,ArrayList<String> Types) {
            Name = NameVal;
            Fields = new ArrayList<StringField>();

            for (int i=0;i<Names.size();i++) {
                switch (Types.get(i)) {
                    case "Int":
                        Fields.add(new IntField(Names.get(i)));
                        break;
                    case "Real":
                        Fields.add(new RealField(Names.get(i)));
                        break;
                    case "Char":
                        Fields.add(new CharField(Names.get(i)));
                        break;
                    case "String":
                        Fields.add(new StringField(Names.get(i)));
                        break;
                    case "Color":
                        Fields.add(new ColorField(Names.get(i)));
                        break;
                    case "ColorInterval":
                        Fields.add(new ColorInvlField(Names.get(i)));
                        break;
                }
            }

        }

        public void AddRow() {
            for (StringField f : Fields) f.addRow();
        }
        public ArrayList<String> FieldsSet(){
            ArrayList<String> ans=new ArrayList<>();
            for(StringField f : Fields){
                ans.add(f.Name);
                ans.add(f.Type.toString());
            }
            return ans;
        }
    }

    public enum FieldTypes {
        Int,
        Real,
        Char,
        String,
        Color,
        ColorInterval
    }

    public class StringField {
        public String Name;
        public FieldTypes Type;
        public ArrayList<String> Values = new ArrayList<>();

        public StringField(String NameVal) {
            Name = NameVal;
            Type = FieldTypes.String;
        }

        public void addRow() {
            Values.add("");
        }

        public int ChangeValue(int Pos, String Value) {
            if (Pos >= Values.size() || Pos < 0) {
                return 2;
            }
            Values.set(Pos, Value);
            return 0;
        }
    }

    public class IntField extends StringField {
        public IntField(String NameVal) {
            super(NameVal);
            Type = FieldTypes.Int;
        }

        public int ChangeValue(int Pos, String Value) {
            if (Value.length() == 0) return 0;
            if (Pos >= Values.size() || Pos < 0) {
                return 2;
            }
            int n;
            try {
                n = Integer.parseInt(Value);
                Values.set(Pos, Value);
                return 0;
            } catch (Exception e) {
                return 1;
            }
        }
    }

    public class RealField extends StringField {
        public RealField(String NameVal) {
            super(NameVal);
            Type = FieldTypes.Real;
        }

        public int ChangeValue(int Pos, String Value) {
            if (Value.length() == 0) return 0;
            if (Pos >= Values.size() || Pos < 0) {
                return 2;
            }
            double n;
            try {
                n = Double.parseDouble(Value);
                Values.set(Pos, Value);
                return 0;
            } catch (Exception e) {
                return 1;
            }
        }
    }

    public class CharField extends StringField {
        public CharField(String NameVal) {
            super(NameVal);
            Type = FieldTypes.Char;
        }

        public int ChangeValue(int Pos, String Value) {
            if (Value.length() == 0) return 0;
            if (Pos >= Values.size() || Pos < 0) {
                return 2;
            }
            char n;
            if (Value.length() == 1) {
                Values.set(Pos, Value);
                return 0;
            }
            return 1;
        }
    }

    public class ColorField extends StringField {
        public ColorField(String NameVal) {
            super(NameVal);
            Type = FieldTypes.Color;
        }

        public int ChangeValue(int Pos, String Value) {
            if (Value.length() == 0) return 0;
            if (Pos >= Values.size() || Pos < 0) {
                return 2;
            }
            if (Value.length() != 7) return 1;
            Pattern pattern = Pattern.compile("#[0-9a-fA-F]{6}");
            Matcher matcher = pattern.matcher(Value);
            if (matcher.find()) {
                Values.set(Pos, Value);
                return 0;
            }
            return 1;
        }
    }

    public class ColorInvlField extends StringField {
        public ColorInvlField(String NameVal) {
            super(NameVal);
            Type = FieldTypes.ColorInterval;
        }

        public int ChangeValue(int Pos, String Value) {
            if (Value.length() == 0) return 0;
            if (Pos >= Values.size() || Pos < 0) {
                return 2;
            }
            if (Value.length() != 15) return 1;
            Pattern pattern = Pattern.compile("#[0-9a-fA-F]{6}-#[0-9a-fA-F]{6}");
            Matcher matcher = pattern.matcher(Value);
            if (matcher.find()) {
                String s1 = Value.substring(1, 6).toUpperCase();
                String s2 = Value.substring(9, 14).toUpperCase();
                for (int i = 0; i < 6; i++) {
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
