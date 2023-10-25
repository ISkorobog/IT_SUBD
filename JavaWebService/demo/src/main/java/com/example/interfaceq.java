package com.example;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import java.util.ArrayList;

import javax.jws.WebMethod;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface interfaceq {


@WebMethod
public void OpenNew();

@WebMethod
public int OpenBase(String Path);
@WebMethod
public boolean BaseOpened();
@WebMethod
public boolean TableOpened();
@WebMethod
public int RowsInTable();
@WebMethod
public int ColumnsInTable();

@WebMethod
public String GetNameInCurrentTable(int i);
@WebMethod
public String GetTypeInCurrentTable(int i);
@WebMethod
public String GetValueInTable(int i, int j);
@WebMethod
public int GetNumberOfTables();
@WebMethod
public int GetNumberOfFieldsInTable(int i);
@WebMethod
public String GetTableName(int i);
@WebMethod
public String GetCurrentTableName();
@WebMethod
public String GetNameInTable(int i, int j);
@WebMethod
public String GetTypeInTable(int i, int j);
@WebMethod
public int ChangeCurrentTable(int i);
@WebMethod
public boolean BaseHasPath();
@WebMethod
public boolean Changed();
@WebMethod
public int Save();

@WebMethod
public String getAllFiles();

@WebMethod
public int SaveAs(String Path);

@WebMethod
public int CreateTable(String Name, String[] arrNames, String[] arrTypes);
@WebMethod
public int OpenTable(String Name);

@WebMethod
public int DeleteTable(String Name);
@WebMethod
public void AddRow();
@WebMethod
public int DeleteRows(int PosRow, int num);
@WebMethod
public int ChangeRowValue(int RowPos, int ColumnPos, String value);
@WebMethod
public String GetPath();

@WebMethod
public int Union(String name, ArrayList<String> Inputargs);
@WebMethod
public void Close();


}
