package com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "payment")
@Entity(name = "payment")
public class Payment {

	@Id
	@Column(name = "id")
	private int id;
	private String adver_email;
	private String payment;
	private String transactionid;
	private double fee;
	private String otpnumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getAdver_email() {
		return adver_email;
	}
	public void setAdver_email(String adver_email) {
		this.adver_email = adver_email;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(String transactionid) {
		this.transactionid = transactionid;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public String getOtpnumber() {
		return otpnumber;
	}
	public void setOtpnumber(String otpnumber) {
		this.otpnumber = otpnumber;
	}
	
}
