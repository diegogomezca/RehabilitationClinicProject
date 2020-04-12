package db.sqlite;

import java.sql.*;

import db.interfaces.DBManager;
import db.interfaces.DepartmentManager;
import db.interfaces.MedicalProfessionalManager;
import db.interfaces.PacientManager;

public class SQLiteManager implements DBManager {

	private Connection c;
	private PacientManager pacient;
	private DepartmentManager department;
	private MedicalProfessionalManager medical_professional;

	@Override
	public void connect() {

		try {
			Class.forName("org.sqlite.JDBC");
			this.c = DriverManager.getConnection("jdbc:sqlite:./db/RehabilitationClinic.db");
			c.createStatement().execute("PRAGMA foreign_keys=ON");
			
			pacient = new SQLitePacientManager(c);
			department = new SQLiteDepartmentManager(c);
			medical_professional = new SQLiteMedicalProfessional(c);
			//We could initialize other manager here
			System.out.println("Database connection opened.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void disconnect() {
		try {
			c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void createTables() {
		// TODO Auto-generated method stub

		// Create tables: begin
		
		
		Statement stmt1;
		try {
			stmt1 = c.createStatement();
			String sql1 = "CREATE TABLE department " + "(id INTEGER PRIMARY KEY AUTOINCREMENT," + "name TEXT NOT NULL,"
					+ "budget REAL NOT NULL," + "floor INTEGER NOT NULL,"
					+ "boss_id INTEGER REFERENCES medical_professional(id) ON UPDATE CASCADE ON DELETE SET NULL)";

			stmt1.executeUpdate(sql1);
			stmt1.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Statement stmt2;
		try {
			stmt2 = c.createStatement();
			String sql2 = "CREATE TABLE dissability " + "(id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,"
					+ "type TEXT NOT NULL," + "severity TEXT," + "affected_area TEXT NOT NULL," + "extra_info TEXT,"
					+ "pacient_id INTEGER NOT NULL REFERENCES pacient(id) ON UPDATE CASCADE ON DELETE SET NULL)";

			stmt2.executeUpdate(sql2);
			stmt2.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Statement stmt3;
		try {
			stmt3 = c.createStatement();
			String sql3 = "CREATE TABLE employee_contract" + "(id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,"
					+ "free_days INTEGER NOT NULL," + "starting_date  DATE NOT NULL," + "finishing_date DATE NOT NULL,"
					+ "salary REAL NOT NULL," + "week_hours REAL NOT NULL)";

			stmt3.executeUpdate(sql3);
			stmt3.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Statement stmt4;
		try {
			stmt4 = c.createStatement();
			String sql4 = "CREATE TABLE pacient" + "(id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,"
					+ "name TEXT NOT NULL," + "sex TEXT," + "dob TEXT," + "nie TEXT NOT NULL,"
					+ "email TEXT NOT NULL," + "active BOOLEAN," + "intern BOOLEAN,"
					+ "adress TEXT NOT NULL," + "phone INTEGER NOT NULL," + "photo BLOB)";
			stmt4.executeUpdate(sql4);
			stmt4.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Statement stmt5;
		try {
			stmt5 = c.createStatement();
			String sql5 = "CREATE TABLE treatment" + "(id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,"
					+ "type TEXT NOT NULL," + "starting_date DATE NOT NULL," + "finishing_date DATE NOT NULL,"
					+ "extra_info TEXT)";
			stmt5.executeUpdate(sql5);
			stmt5.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Statement stmt6;
		try {
			stmt6 = c.createStatement();
			String sql6 = "CREATE TABLE medical_professional" + "(id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,"
					+ "name TEXT NOT NULL," + "dob TEXT," + "profession TEXT NOT NULL,"
					+ "email TEXT NOT NULL," + "adress TEXT NOT NULL," + "phone INTEGER NOT NULL," + "photo BLOB,"
					+ "sex TEXT NOT NULL," + "nie TEXT NOT NULL,"
					+ "contract_id INTEGER REFERENCES employee_contract(id) ON UPDATE CASCADE ON DELETE SET NULL,"
					+ "dep_id INTEGER NOT NULL REFERENCES department(id) ON UPDATE CASCADE ON DELETE SET NULL)";
			stmt6.executeUpdate(sql6);
			stmt6.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Statement stmt7;
		try {
			stmt7 = c.createStatement();
			String sql7 = "CREATE TABLE staff" + "(id INTEGER NOT NULL PRIMARY KEY," + "name TEXT NOT NULL,"
					+ "dob TEXT NOT NULL," + "profession TEXT NOT NULL," + "email TEXT NOT NULL,"
					+ "adress TEXT NOT NULL," + "phone INTEGER NOT NULL," + "photo BLOB," + "sex TEXT NOT NULL,"
					+ "contract_id INTEGER NOT NULL REFERENCES employee_contract(id) ON UPDATE CASCADE ON DELETE SET NULL,"
					+ "dep_id INTEGER NOT NULL REFERENCES department(id) ON UPDATE CASCADE ON DELETE SET NULL)";
			stmt7.executeUpdate(sql7);
			stmt7.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Statement stmt8;
		try {
			stmt8 = c.createStatement();
			String sql8 = "CREATE TABLE medical_professional_treatment "
					+ "(medical_professional_id INTEGER NOT NULL REFERENCES medical_professional(id),"
					+ "treatment_id INTEGER NOT NULL REFERENCES treatment(id),"
					+ "PRIMARY KEY (medical_professional_id, treatment_id))";
			stmt8.executeUpdate(sql8);
			stmt8.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Statement stmt9;
		try {
			stmt9 = c.createStatement();
			String sql9 = "CREATE TABLE treatment_pacient " + "(pacient_id INTEGER NOT NULL REFERENCES pacient(id),"
					+ "treatment_id INTEGER NOT NULL REFERENCES treatment(id),"
					+ "PRIMARY KEY (pacient_id, treatment_id))";
			stmt9.executeUpdate(sql9);
			stmt9.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Statement stmt10;
		try {
			stmt10 = c.createStatement();
			String sql10 = "CREATE TABLE medical_professional_pacient"
					+ "(medical_professional_id INTEGER NOT NULL REFERENCES medical_professional(id),"
					+ "pacient_id INTEGER NOT NULL REFERENCES pacient(id),"
					+ "PRIMARY KEY (medical_professional_id, pacient_id))";
			stmt10.executeUpdate(sql10);
			stmt10.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Tables created.");
	}

	@Override
	public PacientManager getPacientManager() {
		
		return pacient;
	}

	@Override
	public DepartmentManager getDepartmentManager() {
		
		return department;
	}

	@Override
	public MedicalProfessionalManager getMedicalProfessionalManager() {
		
		return medical_professional;
	}

}
