package com.agri.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.agri.entity.Admin;
import com.agri.entity.Farmer;


@Repository
public class AdminRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public Admin fetch(String email, String password) {
		Query q= entityManager.createQuery("select a from Admin a where a.adminEmail=:em and a.adminPassword=:pwd");
		q.setParameter("em", email);
		q.setParameter("pwd", password);

		return (Admin) q.getSingleResult();
	}

	public List<Farmer> fetchAllFarmer(){
		Query q =entityManager.createQuery("select f from Farmer f");
		List<Farmer> list=q.getResultList();
		return list;
	}
	

}
