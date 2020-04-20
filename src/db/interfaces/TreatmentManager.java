package db.interfaces;

import pojos.Treatment;

public interface TreatmentManager {
	
	public void add(Treatment treatment);
	public void deleteById(Integer id);
	public void updateTreatment(Treatment treatment);
	public Treatment searchById(Integer id);
}
