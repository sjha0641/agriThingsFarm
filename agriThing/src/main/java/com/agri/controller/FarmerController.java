package com.agri.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.agri.entity.Farmer;
import com.agri.service.FarmerService;

@Controller
@SessionAttributes("loggedInFarmer")
public class FarmerController {
	
	@Autowired
	private FarmerService farmerService;

	@RequestMapping (path="/farmerRegistration.agri", method=RequestMethod.GET)
	public String saveFarmer(Farmer farmer) {
		try {
			farmerService.saveFarmer(farmer);
			return "successRegistration.jsp";
		}
		catch(Exception e) {
			return "failure.jsp";
		}
	}
	
	
	@RequestMapping("/farmerLogin.agri")
	public String farmerLogin(@RequestParam("farmerEmail") String farmerEmail, @RequestParam("farmerPassword") String farmerPassword, ModelMap model) {
		try {
			Farmer farmer=(Farmer)farmerService.login(farmerEmail, farmerPassword);
			model.put("loggedInFarmer", farmer);
			return "farmerDashboard.jsp";
		} catch (Exception e) {
			model.put("errorMsg", "Please login again");
			return "farmerLogin.jsp";
			
		}
	}
	
}
