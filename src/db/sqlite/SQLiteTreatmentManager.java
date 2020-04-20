package db.sqlite;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pojos.Treatment;



public class SQLiteTreatmentManager  {
	
	private Connection c;
	
	public SQLiteTreatmentManager(Connection n) {
		this.c = n;
	}
		
		public void add(Treatment treatment){
			try {
				String sql = "INSERT INTO treatment(type, finishingDate, startingDate, extraInfo) "
						+ "VALUES (?,?,?,?);";
						
				PreparedStatement prep = c.prepareStatement(sql); 
				prep.setString(1, treatment.getType());
				prep.setDate(2, treatment.getFinishing_date());
				prep.setDate(3, treatment.getStarting_date());
				prep.setString(4, treatment.getExtra_info());
				
				prep.executeUpdate();
				prep.close();
				
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		public Treatment searchById(Integer id) {
			Treatment newTreatment = null;
			
			try {
				String sql = "SELECT * FROM treatment AS d JOIN pacient AS m ON d.id = m."
						+ " WHERE d.id LIKE ?;";
				PreparedStatement prep = c.prepareStatement(sql);
				prep.setInt(1, id);
				ResultSet rs = prep.executeQuery();
				
				int treatmentId = rs.getInt("id");
				String type = rs.getString("type");
				Date finishingDate = rs.getDate("finishingDate");
				Date startingDate = rs.getDate("startingDate");
				String extraInfo = rs.getString("extraInfo");
				
				newTreatment = new Treatment(treatmentId, type, finishingDate, startingDate, extraInfo);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			return newTreatment;
		}
		
		public void deleteById(Integer id) {

			try {
				String sql = "DELETE FROM treatment WHERE id= ?";
				PreparedStatement prep = c.prepareStatement(sql);
				prep.setInt(1, id);
				prep.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public void updateTreatment(Treatment treatment) {
			String sql = "UPDATE treatmet SET type = ?, finishing_date = ?,  starting_date = ?, extra_info = ?";
			PreparedStatement prep;
			
			try {
				prep = c.prepareStatement(sql);
				
				prep.setString(1,treatment.getType());
				prep.setDate(2, treatment.getFinishing_date());
				prep.setDate(3, treatment.getStarting_date());
				prep.setString(4,treatment.getExtra_info());
				
				prep.executeUpdate();
				System.out.println("Update finished");
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
}
