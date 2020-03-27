package ui;

import java.io.BufferedReader;
import java.io.InputStreamReader;
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
	
	public static void main(String[] args) throws Exception{
		reader = new BufferedReader(new InputStreamReader(System.in));
		
		dbManager = new SQLiteManager();
		dbManager.connect();
		pacientManager = dbManager.getPacientManager();
		
		//dbManager.createTables();
		
		
		Pacient newPacient = new Pacient("manteca",true,"098765432L",true,"mantecacorreo@gmail.com",987654321,"micasa","male");
		pacientManager.add(newPacient);
		List<Pacient> pacientList = pacientManager.searchByName("manteca");
		
		for(int i = 0; i< pacientList.size();i++) {
			System.out.println(pacientList.get(i).toString());
		}
		
		Pacient newpacient  = pacientManager.searchById(1);
		System.out.println(newpacient);
		
		pacientManager.deleteById(4);
		
List<Pacient> pacientList1 = pacientManager.searchByName("manteca");
		
		for(int i = 0; i< pacientList1.size();i++) {
			System.out.println(pacientList1.get(i).toString());
		}
		
		
		dbManager.disconnect();
	}
}
