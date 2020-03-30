package db.interfaces;

import java.util.List;
import pojos.*;

public interface DepartmentManager {
	
	public List<Department> searchByName (String name);
	public Department searchById (Integer id);
	public void add (Department department);
	public void deleteById (Integer id);
	public void updateDepartment(Department department);
}
