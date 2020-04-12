package ui;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.Date;
import java.time.format.DateTimeFormatter;
import java.util.*;

import db.interfaces.*;
import db.sqlite.SQLiteManager;
import pojos.*;

public class Menu {

	//Used for parsing dates
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	//Create a BufferedReader
	private static BufferedReader reader;
	
	private static DBManager dbManager;
	private static PacientManager pacientManager;
	private static MedicalProfessionalManager medicalProfessionalManager;
	private static DepartmentManager departmentManager;
	
	public static void main(String[] args) throws Exception{
		
		dbManager = new SQLiteManager();
		dbManager.connect();
		//dbManager.createTables();
		departmentManager = dbManager.getDepartmentManager();
		//Department neurologia = new Department ("neurologia",4,40,null);
		//departmentManager.add(neurologia);
		//medicalProfessionalManager = dbManager.getMedicalProfessionalManager();
		
		//MedicalProfessional medicalProfessional = new MedicalProfessional("juana","female","traumatologo","correo","house",345654,"897324l", 1);
		//System.out.println(medicalProfessional);
		//medicalProfessionalManager.add(medicalProfessional);
		System.out.println(departmentManager.searchById(1));
		
		//String name, int floor, float budget, Integer boss_id
		
		//dbManager.createTables();
		//pacientManager = dbManager.getPacientManager();
		//Pacient newPacient = new Pacient("manteca",true,"098765432L",true,"diegocorreo@gmail.com",987654321,"micasa","male");
		//pacientManager.add(newPacient);
		
		//Submenu1 submenu1 = new Submenu1();
		//submenu1.submenu1_method();
		
		dbManager.disconnect();
		
		/*reader = new BufferedReader(new InputStreamReader(System.in));
		
		dbManager = new SQLiteManager();
		dbManager.connect();
		pacientManager = dbManager.getPacientManager();
		
		
		
		
		Pacient newPacient = new Pacient("manteca",true,"098765432L",true,"diegocorreo@gmail.com",987654321,"micasa","male");
		Pacient newPacient1 = new Pacient("diego",true,"098765432L",true,"diegocorreo@gmail.com",987654321,"micasa","male");
		pacientManager.add(newPacient);
		pacientManager.add(newPacient1);

		
		List<Pacient> pacientList = pacientManager.searchByName("manteca");
		
		for(int i = 0; i< pacientList.size();i++) {
			System.out.println(pacientList.get(i).toString());
		}
		
		
List<Pacient> pacientList1 = pacientManager.searchByName("diego");
		
		for(int i = 0; i< pacientList1.size();i++) {
			System.out.println(pacientList1.get(i).toString());
		}
	
		
		Pacient updatePacient = pacientManager.searchById(2);
		
		updatePacient.setName("xavi");
		
	pacientManager.updatePacient(updatePacient);
	
	System.out.println(pacientManager.searchByName("xavi"));
		
		

		
		
		
		
		
		

		*/
		
		
	}
}
