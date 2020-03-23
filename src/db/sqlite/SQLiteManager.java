package db.sqlite;

import java.sql.*;

import db.interfaces.DBManager;

public class SQLiteManager implements DBManager {

	private Connection c;

	protected Connection getConnection() {
		return c;
	}

	@Override
	public void connect() {

		try {
			Class.forName("org.sqlite.JDBC");
			this.c = DriverManager.getConnection("jdbc:sqlite:./db/RehabilitationClinic.db");
			c.createStatement().execute("PRAGMA foreign_keys=ON");
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

	}

}
