package ui;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Date;
import java.time.format.DateTimeFormatter;


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
		
		
		
		Pacient newPacient = new Pacient("manteca","esteesmidni","mantecacorreo",98,"micasa");
		pacientManager.add(newPacient);
		
		dbManager.disconnect();
	}
}
