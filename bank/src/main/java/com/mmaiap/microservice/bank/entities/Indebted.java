package com.mmaiap.microservice.bank.entities;

import lombok.Data;

@Data
public class Indebted {

	private Integer id;
	private String name;
	private String balance;
	
	public Indebted(User user) {
		this.id = user.getId();
		this.name = user.getName();
		this.balance = user.getBalance().toString();
	}

	public Indebted() {
	}

}
