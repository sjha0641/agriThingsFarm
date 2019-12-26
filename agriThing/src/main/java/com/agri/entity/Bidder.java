package com.agri.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="table_bidder")
public class Bidder {

	@Id
	@GeneratedValue
	private int bidderId;
	private String bidderName;
	private String bidderEmail;
	private String bidderPassword;
	private String bidderVerificationStatus;
	
	public int getBidderId() {
		return bidderId;
	}
	public void setBidderId(int bidderId) {
		this.bidderId = bidderId;
	}
	public String getBidderName() {
		return bidderName;
	}
	public void setBidderName(String bidderName) {
		this.bidderName = bidderName;
	}
	public String getBidderEmail() {
		return bidderEmail;
	}
	public void setBidderEmail(String bidderEmail) {
		this.bidderEmail = bidderEmail;
	}
	public String getBidderPassword() {
		return bidderPassword;
	}
	public void setBidderPassword(String bidderPassword) {
		this.bidderPassword = bidderPassword;
	}
	public String getBidderVerificationStatus() {
		return bidderVerificationStatus;
	}
	public void setBidderVerificationStatus(String bidderVerificationStatus) {
		this.bidderVerificationStatus = bidderVerificationStatus;
	}
	
	
}
