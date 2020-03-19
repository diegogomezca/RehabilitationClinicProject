package db.interfaces;

import java.util.List;

import pojos.*;

public interface MedicalPorfessionalManager {
	
	public List<MedicalProfessional> searchByName (String name);
	public List <MedicalProfessional> searchById (Integer id);
	public void add (MedicalProfessional medicalProfessional);
	public void update (MedicalProfessional medicalProfessional);
}
