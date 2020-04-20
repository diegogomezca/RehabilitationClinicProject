package db.interfaces;

public interface DBManager {

	public void connect();
	public void disconnect();
	public void createTables();
	
	public PacientManager getPacientManager();
	public DepartmentManager getDepartmentManager();
	public MedicalProfessionalManager getMedicalProfessionalManager();
}
