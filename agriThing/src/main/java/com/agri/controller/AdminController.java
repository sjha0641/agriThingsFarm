package com.agri.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.agri.entity.Admin;
import com.agri.entity.Farmer;
import com.agri.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@RequestMapping("/adminLogin.agri")
	public String adminLogin(@RequestParam("adminEmail") String adminEmail, @RequestParam("adminPassword") String adminPassword, ModelMap model) {
		try {
			Admin admin=(Admin)adminService.login(adminEmail, adminPassword);
			model.put("loggedInAdmin", admin);
			return "adminDashboard.jsp";
		} catch (Exception e) {
			model.put("errorMsg", "Please login again");
			return "adminLogin.jsp";
			
		}
	}
	
	@RequestMapping(path ="/fetchAllFarmers.agri")
	public String fetchAllFarmer( ModelMap model, HttpServletRequest request) {
		
		List<Farmer> list = adminService.fetchAllFarmer();
		
		model.put("listOfFarmers", list);
		return "adminFarmerDetails.jsp";
	}
	


}
