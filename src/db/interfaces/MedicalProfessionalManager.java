package db.interfaces;

import java.util.List;

import pojos.*;

public interface MedicalProfessionalManager {
	
	public List<MedicalProfessional> searchByName (String name);
	public MedicalProfessional searchById (Integer id);
	public void add (MedicalProfessional medicalProfessional);
	public void deleteById (Integer id);
	public void updateMedicalProfessional(MedicalProfessional medicalProfessional);
}
