package ui;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.format.DateTimeFormatter;

public class Menu {

	//Used for parsing dates
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	//Create a BufferedReader
	private static BufferedReader reader;
	
	public static void main(String[] args) throws Exception{
		reader = new BufferedReader(new InputStreamReader(System.in));
		
		
	}
}
