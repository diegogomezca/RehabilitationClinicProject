package pojos;

import java.io.Serializable;
import java.sql.Date;

public class Employee_Contract implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2122101848221178012L;
	
	private Integer id;
	private int free_days;
	private Date starting_date;
	private Date finishing_date;
	private int week_working_hours;
	private float salary;
	
	public Employee_Contract() {
		super();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee_Contract other = (Employee_Contract) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	public Integer getId() {
		return id;
	}
	public int getFree_days() {
		return free_days;
	}
	public Date getStarting_date() {
		return starting_date;
	}
	public Date getFinishing_date() {
		return finishing_date;
	}
	public int getWeek_working_hours() {
		return week_working_hours;
	}
	public float getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return "Employee_Contract [id=" + id + ", free_days=" + free_days + ", starting_date=" + starting_date
				+ ", finishing_date=" + finishing_date + ", week_working_hours=" + week_working_hours + ", salary="
				+ salary + "]";
	}
	

}
