package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import db.interfaces.DBManager;
import db.interfaces.DepartmentManager;
import db.interfaces.PacientManager;
import db.sqlite.SQLiteManager;
import pojos.*;

public class MetodosInterfaz {

	private static DBManager dbManager;
	private static DepartmentManager departmentManager;
	private static PacientManager pacientManager;
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	
	public Department searchDepartmentById () throws Exception{
		departmentManager = dbManager.getDepartmentManager();
		System.out.println("Introduce the id: ");
		int id = Integer.parseInt(reader.readLine());
		
		
		return departmentManager.searchById(id);
		
	}
	
	public void showaDepartment (Department department) {
		System.out.println(department);
	}
	
	public void addDepartment () throws Exception {
		System.out.println("Introduce the data for the new department:");
		System.out.println("Introduce the department name:");
		String departmentName = reader.readLine();
		System.out.println("Introduce the department floor:");
		int departmentFloor = Integer.parseInt(reader.readLine());
		System.out.println("Introduce the department budget:");
		int departmentBudget = Integer.parseInt(reader.readLine());
		System.out.println("Introduce the department boss_id:");
		int boss_id = Integer.parseInt(reader.readLine());
		
		Department newdepartment = new Department(departmentName,departmentFloor,departmentBudget,boss_id);
		departmentManager.add(newdepartment);
	}
	
	public  Patient searchPatientById () throws Exception {
		dbManager = new SQLiteManager();
		dbManager.connect();
		pacientManager = dbManager.getPacientManager();
		System.out.println("Introduce the id: ");
		int id = Integer.parseInt(reader.readLine());
		
		
		return pacientManager.searchById(id);
		
	}
	
	public void showaPatient (Patient patient) {
		System.out.println(patient);
	}
	
	public void addPatient () throws Exception {
		dbManager = new SQLiteManager();
		dbManager.connect();
		pacientManager = dbManager.getPacientManager();
		System.out.println("Introduce el nombre del paciente:");
		String patientName = reader.readLine();
		System.out.println("Introduce the patient nie:");
		String patientNie = reader.readLine();
		System.out.println("Introduce the patient correo:");
		String patientCorreo = reader.readLine();
		
		Patient newPatient = new Patient(patientName,true,patientNie,false,patientCorreo,9876543,"lacasa","male");
		
		pacientManager.add(newPatient);
		dbManager.disconnect();
		
		
	}
}
