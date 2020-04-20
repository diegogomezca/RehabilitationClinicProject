package pojos;

import java.io.Serializable;
import java.sql.Date;

public class Treatment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -428053686064463538L;
	private Integer id;
	private String type;
	private Date finishing_date;
	private Date starting_date;
	private String extra_info;
	
	
	
	public Treatment(Integer id, String type, Date finishing_date, Date starting_date, String extra_info) {
		super();
		this.id = id;
		this.type = type;
		this.finishing_date = finishing_date;
		this.starting_date = starting_date;
		this.extra_info = extra_info;
	}
	public Treatment(String type, Date finishing_date, Date starting_date, String extra_info) {
		super();
		this.type = type;
		this.finishing_date = finishing_date;
		this.starting_date = starting_date;
		this.extra_info = extra_info;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getFinishing_date() {
		return finishing_date;
	}
	public void setFinishing_date(Date finishing_date) {
		this.finishing_date = finishing_date;
	}
	public Date getStarting_date() {
		return starting_date;
	}
	public void setStarting_date(Date starting_date) {
		this.starting_date = starting_date;
	}
	public String getExtra_info() {
		return extra_info;
	}
	public void setExtra_info(String extra_info) {
		this.extra_info = extra_info;
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
		Treatment other = (Treatment) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Treatment [id=" + id + ", type=" + type + ", finishing_date=" + finishing_date + ", starting_date="
				+ starting_date + ", extra_info=" + extra_info + "]";
	}
	public Treatment() {
		super();
	}
	
	
}
