package pojos;

import java.sql.Blob;
import java.sql.Date;

public class Pacient {

	private Integer id;
	private String name;
	private Sexo sex;
	private Date dob;
	private Boolean intern;
	private String nie;
	private Blob photo;
	private Boolean active;
	
	public enum Sexo{
		
		MALE,FEMALE
	}
	
	public Pacient() {
		super();
	}


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


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public Boolean getIntern() {
		return intern;
	}


	public void setIntern(Boolean intern) {
		this.intern = intern;
	}


	public String getNie() {
		return nie;
	}


	public void setNie(String nie) {
		this.nie = nie;
	}


	public Blob getPhoto() {
		return photo;
	}


	public void setPhoto(Blob photo) {
		this.photo = photo;
	}


	public Boolean getActive() {
		return active;
	}


	public void setActive(Boolean active) {
		this.active = active;
	}


	@Override
	public String toString() {
		return "Pacient [id=" + id + ", name=" + name + ", sex=" + sex + ", dob=" + dob + ", intern=" + intern
				+ ", nie=" + nie + ", photo=" + photo + ", active=" + active + "]";
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
		Pacient other = (Pacient) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
