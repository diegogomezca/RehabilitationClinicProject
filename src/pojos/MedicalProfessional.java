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
	private String sex;
	private String profession;
	private Blob photo;
	private String email;
	private String adress;
	private int phoneNumber;
	private String nif;
	private Integer employee_contractId;
	private Integer dep_id;
	
	

	
	public MedicalProfessional(Integer id, String name, Date dob, String sex, String profession, String email,
			String adress, int phoneNumber, String nif, Integer dep_id) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.sex = sex;
		this.profession = profession;
		this.email = email;
		this.adress = adress;
		this.phoneNumber = phoneNumber;
		this.nif = nif;
		this.dep_id = dep_id;
	}
	
	


	public MedicalProfessional(String name, Date dob, String sex, String profession, Blob photo, String email,
			String adress, int phoneNumber, String nif, Integer dep_id) {
		super();
		this.name = name;
		this.dob = dob;
		this.sex = sex;
		this.profession = profession;
		this.photo = photo;
		this.email = email;
		this.adress = adress;
		this.phoneNumber = phoneNumber;
		this.nif = nif;
		this.dep_id = dep_id;
	}




	public MedicalProfessional(String name, String sex, String profession, String email, String adress, int phoneNumber,
			String nif, Integer dep_id) {
		super();
		this.name = name;
		this.sex = sex;
		this.profession = profession;
		this.email = email;
		this.adress = adress;
		this.phoneNumber = phoneNumber;
		this.nif = nif;
		this.dep_id = dep_id;
	}









	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
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
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	public Integer getEmployee_contractId() {
		return employee_contractId;
	}




	public void setEmployee_contractId(Integer employee_contractId) {
		this.employee_contractId = employee_contractId;
	}




	public Integer getDep_id() {
		return dep_id;
	}


	public void setDep_id(Integer dep_id) {
		this.dep_id = dep_id;
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
				+ profession + ", photo=" + photo + ", email=" + email + ", adress=" + adress + ", phoneNumber="
				+ phoneNumber + ", nif=" + nif + ", employee_contractId=" + employee_contractId + ", dep_id=" + dep_id
				+ "]";
	}


	
}

