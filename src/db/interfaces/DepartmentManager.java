package db.interfaces;

import java.util.List;
import pojos.*;

public interface DepartmentManager {
	
	public List<Department> searchByName (String name);
	public List<Department> searchById (Integer id);
	public void add (Department department);
	public void update (Department department);
	
}
