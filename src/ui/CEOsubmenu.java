package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import db.interfaces.*;

public class CEOsubmenu {

	private static BufferedReader reader;
	private MetodosInterfaz metodos;
	
	public void CEUsubmenu_method () throws Exception {
		reader = new BufferedReader(new InputStreamReader(System.in));
		metodos = new MetodosInterfaz();
		System.out.println("What do you want to do?");
		System.out.println("1.-Department changes");
		System.out.println("2.-Medical_professional changes");
		System.out.println("3.-Patients changes");
		System.out.println("4.-Staff changes");
		
		int choice = Integer.parseInt(reader.readLine());
		switch (choice) {
		case 1:
			System.out.println("DEPARTMENTS");
			System.out.println("1.-Search by id");
			System.out.println("2.-Search by name");
			System.out.println("3.-Update a department");
			System.out.println("4.-Eliminate a department");
			System.out.println("5.-Add a department");
			int departmentchoice = Integer.parseInt(reader.readLine());
			switch (departmentchoice) {
			case 1:
				
				metodos.showaDepartment(metodos.searchDepartmentById());
				break;
			case 5:
				metodos.addDepartment();
				break;
			}
		case 3:
			System.out.println("PATIENTS");
			System.out.println("1.-Search by id");
			System.out.println("2.-Search by name");
			System.out.println("3.-Update a patient");
			System.out.println("4.-Eliminate a patient");
			System.out.println("5.-Add a patient");
			int patientchoice = Integer.parseInt(reader.readLine());
			switch (patientchoice) {
			case 1:
				metodos.showaPatient(metodos.searchPatientById());
				
				break;
			case 5:
				metodos.addPatient();
				break;
			}
		}
	}


		
	}
	

