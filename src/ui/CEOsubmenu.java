package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import db.interfaces.*;

public class CEOsubmenu {

	private static BufferedReader reader;
	
	
	public void CEUsubmenu_method () throws Exception {
		reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What do you want to do?");
		System.out.println("1.-Department changes");
		System.out.println("2.-Medical_professional changes");
		System.out.println("3.-Patients changes");
		
		int choice = Integer.parseInt(reader.readLine());
		switch (choice) {
		case 1:
			System.out.println("DEPARTMENTS");
			System.out.println("1.-Search by id");
			System.out.println("2.-Search by name");
			System.out.println("3.-Update a department");
			System.out.println("4.-Eliminate a department");
			int departmentchoice = Integer.parseInt(reader.readLine());
			switch (departmentchoice) {
			case 1:
				
				
			}
		}
	}


		
	}
	

