package db.interfaces;

import java.util.List;

import pojos.*;

public interface StaffManager {
	
	public void add(Staff staff);
	public void update(Staff staff);
	public List<Staff> searchByName(String name);
	public Staff searchById(Integer id);
	

}
