package db.sqlite;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import db.interfaces.PacientManager;
import pojos.Department;
import pojos.Pacient;

//Estos metodos no incluyen stafflist ni medical professionallist, porque son atributos que añadimos mas tarde y no estan en las tabas
public class SQLiteDepartment {
	
	private Connection c;

	public SQLiteDepartment(Connection n) {
		this.c = n;
	}
		
	public void add(Department department) {
	
		try {
			String sql = "INSERT INTO department (name, budget ,floor,boss_id ) "
					+ "VALUES (?,?,?,?);";
			
			PreparedStatement prep = c.prepareStatement(sql);
			prep.setString(1, department.getName());
			prep.setFloat(2, department.getBudget());
			prep.setInt(3, department.getFloor());
			prep.setInt(4, department.getBoss_id());
			
			prep.executeUpdate();
			prep.close();
		} catch (SQLException e) {
			e.printStackTrace();}
	}

	public List<Department> searchByName(String name) {
		List<Department> departmentList = new ArrayList<Department>();
		try {
			String sql = "SELECT * FROM department WHERE name LIKE ?";
			PreparedStatement prep = c.prepareStatement(sql);
			prep.setString(1, "%" + name + "%");
			ResultSet rs = prep.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String departmentName = rs.getString("name");
				Float budget = rs.getFloat("budget");
				int floor = rs.getInt("floor");
				Integer boss_id = rs.getInt("boss_id");

				Department newDepartment = new Department(id,departmentName,floor,budget,boss_id);
				departmentList.add(newDepartment);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return departmentList;
	}

	public Department searchByid(Integer id1) {
	Department newDepartment = new Department();
	try {
		String sql = "SELECT * FROM depatment WHERE id LIKE ?";
		PreparedStatement prep = c.prepareStatement(sql);
		prep.setInt(1, id1);
		ResultSet rs = prep.executeQuery();
		
			int id = rs.getInt("id");
			String departmentName = rs.getString("name");
			Float budget = rs.getFloat("budget");
			int floor = rs.getInt("floor");
			Integer boss_id = rs.getInt("boss_id");

			newDepartment = new Department(id,departmentName,floor,budget,boss_id);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return newDepartment;
}

	public void deleteById (Integer id) {
		
		try {
		String sql = "DELETE FROM department WHERE id= ?";
		PreparedStatement prep = c.prepareStatement(sql);
		prep.setInt(1, id);
		prep.executeUpdate();
		System.out.println("Deletion finished.");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
