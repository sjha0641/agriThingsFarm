package com.agri.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.agri.entity.Farmer;

@Repository
public class FarmerRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void saveFarmer(Farmer farmer) {
		entityManager.merge(farmer);
	}
	
	public Farmer fetch(String email, String password) {
		Query q= entityManager.createQuery("select f from Farmer f where f.farmerEmail=:em and f.farmerPassword=:pwd");
		q.setParameter("em", email);
		q.setParameter("pwd", password);

		return (Farmer) q.getSingleResult();
	}
	
	
	

}
