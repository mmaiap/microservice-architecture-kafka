package com.mmaiap.microservice.userlistener.kafka;

import com.mmaiap.microservice.userlistener.domain.Indebted;

import lombok.Data;

@Data
public class UserIndebted {
	
	private String name;
	private String balance;
	
	public Indebted toDomain() {
		Indebted user = new Indebted();
		user.setName(name);
		user.setBalance(balance);
		return user;
	}

}
