package com.spring.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "jobseeker")
@Table(name = "jobseeker")
public class JobSeeker {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "seeker_code")
	private String code;
	private String fname;
	private String lname;
	private String presentaddress;
	private String permanentaddress;
	private String nid;
	private Date birth;
	private String number;
	private String email;
	private String password;
	private String education;
	private String company;
	
	public JobSeeker() {
		super();
	}

	public JobSeeker(int id, String code, String fname, String lname, String presentaddress, String permanentaddress,
			String nid, Date birth, String number, String email, String password, String education, String company) {
		super();
		this.id = id;
		this.code = code;
		this.fname = fname;
		this.lname = lname;
		this.presentaddress = presentaddress;
		this.permanentaddress = permanentaddress;
		this.nid = nid;
		this.birth = birth;
		this.number = number;
		this.email = email;
		this.password = password;
		this.education = education;
		this.company = company;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPresentaddress() {
		return presentaddress;
	}

	public void setPresentaddress(String presentaddress) {
		this.presentaddress = presentaddress;
	}

	public String getPermanentaddress() {
		return permanentaddress;
	}

	public void setPermanentaddress(String permanentaddress) {
		this.permanentaddress = permanentaddress;
	}

	public String getNid() {
		return nid;
	}

	public void setNid(String nid) {
		this.nid = nid;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
}
