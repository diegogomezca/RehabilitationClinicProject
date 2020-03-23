package db.sqlite;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.interfaces.PacientManager;
import pojos.Pacient;

public class SQLitePacientManager implements PacientManager {

	private Connection c;

	public SQLitePacientManager(Connection n) {
		this.c = c;
	}

	@Override
	public void add(Pacient pacient) {

		try {
			String sql = "INSERT INTO pacient (name, nie, email,  adress , phone) "
					+ "VALUES (?,?,?,?,?);";
			System.out.println("hola");
			PreparedStatement prep = c.prepareStatement(sql);
			System.out.println("hola");
			prep.setString(1, pacient.getName());
			//(2, pacient.getSex());
			//prep.setDate(3, pacient.getDob());
			prep.setString(2, pacient.getNie());
			prep.setString(3, pacient.getEmail());
			prep.setString(4, pacient.getAdress());
			prep.setInt(5, pacient.getPhoneNumber());

			prep.executeUpdate();
			prep.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void update(Pacient pacient) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Pacient> searchByName(String name) {
		List<Pacient> pacientList = new ArrayList<Pacient>();
		try {
			String sql = "SELECT * FROM pacient WHERE name LIKE ?";
			PreparedStatement prep = c.prepareStatement(sql);
			prep.setString(1, "%" + name + "%");
			ResultSet rs = prep.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String pacientName = rs.getString("name");
				Date dob = rs.getDate("dob");
				String nie = rs.getString("mie");
				String email = rs.getString("email");
				String adress = rs.getString("address");
				int phone = rs.getInt("phone");
				Pacient newPacient = new Pacient(id, pacientName,dob, nie, email, phone, adress);
				pacientList.add(newPacient);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pacientList;
	}

	@Override
	public List<Pacient> searchById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
