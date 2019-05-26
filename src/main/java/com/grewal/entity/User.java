package com.grewal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@NamedQueries(value= {@NamedQuery (name="User.login", query="SELECT u FROM com.grewal.entity.User u where u.email = ?1 and u.password = ?2")})
@Table(name="user")
public class User {
	
	@Id
	@Column(name="userId")
	@GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "user_seq")
	@SequenceGenerator(name = "user_seq", sequenceName = "SEQ_USER_ID", initialValue = 1, allocationSize = 1)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email", unique=true)
	private String email;
	
	@Column(name="password")
	private String password;

	public User(int id, String name, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
