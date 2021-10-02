package com.spring.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "applyjob")
@Table(name = "applyjob")
public class ApplyJob {

	@Id
	@Column(name = "id")
	private int id;
	private String jobtitle;
	private String location;
	private String civi;
	private String proposel;
	private String adver_code;
	private String create_code;
	private String seeker_code;
	private String fname;
	private String lname;
	private String nid;
	private String email;
	
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
	public String getNid() {
		return nid;
	}
	public void setNid(String nid) {
		this.nid = nid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getJobtitle() {
		return jobtitle;
	}
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCivi() {
		return civi;
	}
	public void setCivi(String civi) {
		this.civi = civi;
	}
	public String getProposel() {
		return proposel;
	}
	public void setProposel(String proposel) {
		this.proposel = proposel;
	}
	public String getAdver_code() {
		return adver_code;
	}
	public void setAdver_code(String adver_code) {
		this.adver_code = adver_code;
	}
	public String getCreate_code() {
		return create_code;
	}
	public void setCreate_code(String create_code) {
		this.create_code = create_code;
	}
	public String getSeeker_code() {
		return seeker_code;
	}
	public void setSeeker_code(String seeker_code) {
		this.seeker_code = seeker_code;
	}
	
	
}
