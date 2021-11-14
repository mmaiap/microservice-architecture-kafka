package com.mmaiap.microservice.userlistener.kafka;

import com.mmaiap.microservice.userlistener.domain.Indebted;

import lombok.Data;

@Data
public class UserIndebted {

	private Long id;
	private String name;
	private String balance;
	
	public Indebted toDomain() {
		Indebted ind = new Indebted();
		ind.setId(id);
		ind.setName(name);
		ind.setBalance(balance);
		return ind;
	}

}
