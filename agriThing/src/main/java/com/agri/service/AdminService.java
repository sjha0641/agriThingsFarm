package com.agri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agri.entity.Admin;
import com.agri.entity.Farmer;
import com.agri.exception.AdminLoginException;
import com.agri.repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository adminRepository;
	
	public Admin login(String email, String password) throws AdminLoginException {
	
		try {
			Admin admin= adminRepository.fetch(email, password);
			return admin;
		} catch(Exception e) {
			e.printStackTrace();
			throw new AdminLoginException("invalid id and password", e);
		}
	}
	
	public List<Farmer> fetchAllFarmer() {
		List<Farmer> list=adminRepository.fetchAllFarmer();
		return list;
	}
	
	

}
