package pojos;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Date;
import java.util.ArrayList;

public class Pacient implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2071328715533081411L;
	private Integer id;
	private String name;
	private Date dob;
	private Boolean intern;
	private String nie;
	private Blob photo;
	private Boolean active;
	private String email;
	private int phoneNumber;
	private String adress;
	private ArrayList<Dissability> dissabilityList = new ArrayList<Dissability> ();	
	private String sex;
	
	public Pacient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Pacient(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public Pacient(String name, String nie, String email, int phoneNumber, String adress) {
		super();
		this.name = name;
		this.nie = nie;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.adress = adress;
	}
	
	public Pacient(Integer id, String name, Date dob, String nie, String email, int phoneNumber,
			String adress) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.dob = dob;
		this.nie = nie;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.adress = adress;
	}

	public Pacient(String name) {
		super();
		this.name = name;
	}		
	
	public Pacient(Integer id, String name, Date dob, Boolean intern, String nie, Boolean active, String email,
			int phoneNumber, String adress, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.intern = intern;
		this.nie = nie;
		this.active = active;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.adress = adress;
		this.sex = sex;
	}

	public Pacient(String name, Boolean intern, String nie, Boolean active, String email, int phoneNumber,String adress, String sex) {
		super();
		this.name = name;
		this.intern = intern;
		this.nie = nie;
		this.active = active;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.adress = adress;
		this.sex = sex;
	}


	public Pacient(String name2, String nif, String phoneNumber2, String adress2, String email2, String sex2,
			Boolean intern2) {
		// TODO Auto-generated constructor stub
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public ArrayList<Dissability> getDissabilityList() {
		return dissabilityList;
	}
	public void setDissabilityList(ArrayList<Dissability> dissabilityList) {
		this.dissabilityList = dissabilityList;
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
	@Override
	public String toString() {
		return "Pacient [id=" + id + ", name=" + name + ", sex=" + sex + ", dob=" + dob + ", intern=" + intern
				+ ", nie=" + nie + ", active=" + active + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ ", adress=" + adress + ", dissabilityList=" + dissabilityList + "]";
	}
	
	
	
}