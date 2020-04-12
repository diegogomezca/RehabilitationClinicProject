package db.interfaces;

import java.util.List;
import pojos.*;


public interface PacientManager {

	public void add (Patient pacient);
	// public void releaseDate
	public void updatePacient (Patient pacient);
	public List<Patient> searchByName (String name);
	public Patient searchById (Integer id);
	public void deleteById(Integer id);
}
