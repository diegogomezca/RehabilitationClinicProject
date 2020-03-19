package db.interfaces;

import java.util.List;
import pojos.*;


public interface PacientManager {

	public void add (Pacient pacient);
	// public void releaseDate
	public void update (Pacient pacient);
	public List<Pacient> searchByName (String name);
	public List<Pacient> searchById (Integer id);
	// checkActive
	
}
