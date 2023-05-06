package com.demo.model;

public class User {

	

	
	private int id;
	
	private String firstname;
	
	private String lastname;
	
	private String middlename;
	
	private String course;
	
	private String countrycode;
	
	private long phone;
	
	private String email;
	
	private String psw;
	
	private String pswrepeat;
	
	private String address;
	
	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", middlename=" + middlename
				+ ", course=" + course + ", countrycode=" + countrycode + ", phone=" + phone + ", email=" + email
				+ ", psw=" + psw + ", pswrepeat=" + pswrepeat + ", address=" + address + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCountrycode() {
		return countrycode;
	}

	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public String getPswrepeat() {
		return pswrepeat;
	}

	public void setPswrepeat(String pswrepeat) {
		this.pswrepeat = pswrepeat;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public User(int id,String firstname, String lastname, String middlename, String course, String countrycode, long phone,
			String email, String psw, String pswrepeat, String address) {
		super();
		this.id=id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.middlename = middlename;
		this.course = course;
		this.countrycode = countrycode;
		this.phone = phone;
		this.email = email;
		this.psw = psw;
		this.pswrepeat = pswrepeat;
		this.address = address;
	}
	
	public User()
	{
		
	}
	
}
