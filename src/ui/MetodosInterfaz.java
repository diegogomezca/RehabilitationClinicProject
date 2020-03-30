package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import db.interfaces.DBManager;
import db.interfaces.DepartmentManager;
import pojos.*;

public class MetodosInterfaz {

	private static DBManager dbManager;
	private static DepartmentManager departmentManager;
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	
	public List<Department> searchDepartmentById () throws Exception{
		departmentManager = dbManager.getDepartmentManager();
		System.out.println("Introduzca el id: ");
		int id = Integer.parseInt(reader.readLine());
		
		departmentManager.searchById(id);
		return null;
		
	}
}
