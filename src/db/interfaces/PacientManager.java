package db.interfaces;

import java.util.List;
import pojos.*;


public interface PacientManager {

	public void add (Pacient pacient);
	// public void releaseDate
	public void updatePacient (Pacient pacient);
	public List<Pacient> searchByName (String name);
	public Pacient searchById (Integer id);
	public void deleteById(Integer id);
}
