package pojos;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Date;

public class MedicalProfessional implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6497160293984561608L;
	private Integer id;
	private String name;
	private Date dob;
	private Sex sex;
	private String profession;
	private Blob photo;
	private String email;
	private String adress;
	private int phone;
	public enum Sex {MALE, FEMALE}
	
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Sex getSex() {
		return sex;
	}
	public void setSex(Sex sex) {
		this.sex = sex;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
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
		MedicalProfessional other = (MedicalProfessional) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "MedicalProfessional [id=" + id + ", name=" + name + ", dob=" + dob + ", sex=" + sex + ", profession="
				+ profession + ", email=" + email + ", adress=" + adress + ", phone=" + phone + "]";
	}
	
	public MedicalProfessional() {
		super();
	}
	
}

