package pojos;

import java.io.Serializable;

public class Dissability implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8019087939231325067L;
	private Integer id;
	private String type;
	private String severity;
	private String extra_info;
	private String affected_area;
	
	public Dissability() {
		super();
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
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public String getExtra_info() {
		return extra_info;
	}
	public void setExtra_info(String extra_info) {
		this.extra_info = extra_info;
	}
	public String getAffected_area() {
		return affected_area;
	}
	public void setAffected_area(String affected_area) {
		this.affected_area = affected_area;
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
		Dissability other = (Dissability) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Dissability [id=" + id + ", type=" + type + ", severity=" + severity + ", extra_info=" + extra_info
				+ ", affected_area=" + affected_area + "]";
	}
	
	
}
