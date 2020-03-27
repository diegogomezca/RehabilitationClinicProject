package db.interfaces;

import java.util.List;
import pojos.*;


public interface PacientManager {

	public void add (Pacient pacient);
	// public void releaseDate
	public void update (Pacient pacient);
	public List<Pacient> searchByName (String name);
	public Pacient searchById (Integer id);
	public void deleteById(Integer id);
<<<<<<< HEAD
=======
<<<<<<< HEAD
	public void updatePacient(Pacient pacient);
=======

>>>>>>> branch 'master' of https://github.com/diegogomezca/RehabilitationClinicProject
>>>>>>> branch 'master' of https://github.com/diegogomezca/RehabilitationClinicProject
	// checkActive
	
}
