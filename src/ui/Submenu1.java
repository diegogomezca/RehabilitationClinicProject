package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Submenu1 {

	private static BufferedReader reader;
	CEOsubmenu ceosubmenu;
	
	public void submenu1_method () throws Exception {
		reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Bienvenido RehabilitationClinic");
		System.out.println("Who are you?");
		System.out.println("1.-CEO");
		System.out.println("2.-Patient");
		System.out.println("3.-Medical_professional");
		System.out.println("4.-Receptionist");
		
		int choice = Integer.parseInt(reader.readLine());
		switch (choice) {
		case 1:
			ceosubmenu = new CEOsubmenu();
			ceosubmenu.CEUsubmenu_method();
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		}
		
		
	}
}


