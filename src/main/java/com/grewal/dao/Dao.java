package com.grewal.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Dao {
	public Dao() {
		
	}
	
	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("MemeWeb");
	EntityManager em = emf.createEntityManager();

	public void closeEMF() {
		em.close();
		emf.close();
	}
	
	public void addUser(com.grewal.entity.User user){
		em.getTransaction().begin();
		em.persist(user);
		em.flush();
		em.getTransaction().commit();	
	}
}
