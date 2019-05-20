package com.grewal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@Column(name="userId")
	@GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "user_seq")
	@SequenceGenerator(name = "user_seq", sequenceName = "SEQ_USER_ID", initialValue = 1, allocationSize = 1)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="user_name", unique=true)
	private String user_name;
	
	@Column(name="password")
	private String password;

	public User(int id, String name, String user_name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.user_name = user_name;
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

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
