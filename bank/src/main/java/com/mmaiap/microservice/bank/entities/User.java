package com.mmaiap.microservice.bank.entities;

import lombok.Data;

@Data
public class User {
	
	private Integer id;
	private String name;
	private Integer age;
	private Double balance;
	
	public User() {}
	
	public User(Integer id, String name, Integer age, Double balance) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.balance = balance;
	}
	
	

}
