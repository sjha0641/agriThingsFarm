package com.agri.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name= "table_farmer")
public class Farmer {
	
	@Id
	@GeneratedValue
	private int farmerId;
	private String farmerName;
	private String farmerEmail;
	private String farmerPassword;
	private String farmerVerificationStatus;
	
	public int getFarmerId() {
		return farmerId;
	}
	public void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
	}
	public String getFarmerName() {
		return farmerName;
	}
	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}
	public String getFarmerEmail() {
		return farmerEmail;
	}
	public void setFarmerEmail(String farmerEmail) {
		this.farmerEmail = farmerEmail;
	}
	public String getFarmerPassword() {
		return farmerPassword;
	}
	public void setFarmerPassword(String farmerPassword) {
		this.farmerPassword = farmerPassword;
	}
	public String getFarmerVerificationStatus() {
		return farmerVerificationStatus;
	}
	public void setFarmerVerificationStatus(String farmerVerificationStatus) {
		this.farmerVerificationStatus = farmerVerificationStatus;
	}
	
	

}
