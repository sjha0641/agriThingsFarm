package com.agri.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agri.entity.Farmer;
import com.agri.exception.FarmerLoginException;
import com.agri.repository.FarmerRepository;

@Service
public class FarmerService {
	
	@Autowired
	private FarmerRepository farmerRepository;
	
	public void saveFarmer(Farmer farmer) {
		farmer.setFarmerVerificationStatus("NO");
		farmerRepository.saveFarmer(farmer);	
	}
	
	public Farmer login(String farmerEmail, String farmerPassword) throws FarmerLoginException{
		
		try {
			Farmer farmer= farmerRepository.fetch(farmerEmail, farmerPassword);
			return farmer;
		} catch(Exception e) {
			e.printStackTrace();
			throw new FarmerLoginException("Invalid Id and Password",e);
		}
	}

}
