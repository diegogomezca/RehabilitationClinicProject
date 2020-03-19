package pojos;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Date;

public class Staff implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9189858390611804805L;
	public enum Sexo{
		MALE, FEMALE
	}
	
	private Integer id;
	private String name;
	private Sexo sexo;
	private Date dob;
	private String profession;
	private Blob photo;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public Blob getPhoto() {
		return photo;
	}
	public void setPhoto(Blob photo) {
		this.photo = photo;
	}
	
	
	public Staff() {
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
		Staff other = (Staff) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + ", sexo=" + sexo + ", dob=" + dob + ", profession=" + profession
				+ "]";
	}	

	
	
}

