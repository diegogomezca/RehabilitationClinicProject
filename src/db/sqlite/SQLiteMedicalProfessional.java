package db.sqlite;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.interfaces.MedicalProfessionalManager;
import pojos.MedicalProfessional;


public class SQLiteMedicalProfessional implements MedicalProfessionalManager{
	
	private Connection c;

	public SQLiteMedicalProfessional(Connection n) {
		this.c = n;
	}

	
	@Override 
	public void add(MedicalProfessional medicalProfessional) {
		 
		
		
	
		try {
			String sql = "INSERT INTO medical_professional(name, sex, profession, email, adress, phone, nie, dep_id)"
					+ "VALUES (?,?,?,?,?,?,?,?);";
			PreparedStatement prep = c.prepareStatement(sql);
			
			prep.setString(1, medicalProfessional.getName());
			//prep.setDate(2, medicalProfessional.getDob());
			prep.setString(2, medicalProfessional.getSex());
			prep.setString(3,medicalProfessional.getProfession());
			prep.setString(4, medicalProfessional.getEmail());
			prep.setString(5, medicalProfessional.getAdress());
			prep.setInt(6, medicalProfessional.getPhoneNumber());
			prep.setString(7, medicalProfessional.getNif());
			prep.setInt(8, medicalProfessional.getDep_id());
			
			prep.executeUpdate();
			prep.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public List<MedicalProfessional> searchByName(String name) {
		List<MedicalProfessional> medicalProfessionalList = new ArrayList<MedicalProfessional>();
		
		try {
			String sql = "SELECT * FROM medical_professional WHERE name LIKE ?";
			PreparedStatement prep = c.prepareStatement(sql);
			prep.setString(1, "%" + name + "%");
			ResultSet rs = prep.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String MedicalProfessionalName = rs.getString("name");
				String sex = rs.getString("sex");
				Date dob = rs.getDate("dob");
				String profession = rs.getString("profession");
				String email = rs.getString("email");
				String adress = rs.getString("adress");
				int phone = rs.getInt("phone");
				String nif = rs.getString("nif");
				Integer dep_id = rs.getInt("dep_id");
				MedicalProfessional newMedicalProfessional = new MedicalProfessional(id, MedicalProfessionalName, dob, sex, profession, email, adress, phone, nif,dep_id);
				medicalProfessionalList.add(newMedicalProfessional);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return medicalProfessionalList;
	}
	
	
	public MedicalProfessional searchById(Integer id) {
		
		MedicalProfessional newMedicalProfessional = null;
		
		try {
			String sql = "SELECT * FROM medical_professional WHERE id LIKE ?";
			PreparedStatement prep = c.prepareStatement(sql);
			prep.setInt(1, id);
			ResultSet rs = prep.executeQuery();
			
			int medicalProfessional_id = rs.getInt("id");
			String medicalProfessionalName = rs.getString("name");
			String sex = rs.getString("sex");
			Date dob = rs.getDate("dob");
			String profession = rs.getString("profession");
			String email = rs.getString("email");
			String adress = rs.getString("adress");
			int phone = rs.getInt("phone");
			String nif = rs.getString("nif");
			Integer dep_id = rs.getInt("dep_id");
			
			newMedicalProfessional = new MedicalProfessional(medicalProfessional_id, medicalProfessionalName, dob, sex, profession, email, adress, phone, nif,dep_id);
				
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	 return newMedicalProfessional;
	}
	
	@Override
	public void deleteById(Integer id) {
		
		try {
		String sql = "DELETE FROM medical_professional WHERE id= ?";
		PreparedStatement prep = c.prepareStatement(sql);
		prep.setInt(1, id);
		prep.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateMedicalProfessional(MedicalProfessional medicalProfessional) {
		
		String sql = "UPDATE pacient SET name = ?, sex = ?, profession = ?, email = ?, adress = ?, phone = ?, nif = ? WHERE id=?";
		PreparedStatement prep;
		try {
			prep = c.prepareStatement(sql);
			
			prep.setString(1, medicalProfessional.getName());
			//prep.setDate(2, medicalProfessional.getDob());
			prep.setString(2, medicalProfessional.getSex());
			prep.setString(3,medicalProfessional.getProfession());
			prep.setString(4, medicalProfessional.getEmail());
			prep.setString(5, medicalProfessional.getAdress());
			prep.setInt(6, medicalProfessional.getPhoneNumber());
			prep.setString(7, medicalProfessional.getNif());		
			prep.executeUpdate();
			System.out.println("Update finished.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



	
	
}
