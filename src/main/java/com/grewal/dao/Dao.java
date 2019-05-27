package com.grewal.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.grewal.entity.User;

public class Dao {
	public Dao() {
		
	}
	
	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("NasaWeb");
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

	public User login(String email, String password) {
		// TODO Auto-generated method stub
		User user = null;
		try {
			user = em.createNamedQuery("User.login", User.class)
					.setParameter(1, email)
					.setParameter(2, password).getSingleResult();
		} catch (Exception e) {
			System.out.println(e);
		}
		return user;
	}
}
