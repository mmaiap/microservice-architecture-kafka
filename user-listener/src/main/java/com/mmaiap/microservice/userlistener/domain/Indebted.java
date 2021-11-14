package com.mmaiap.microservice.userlistener.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@Data
public class Indebted {
	
	@Id
	private Long id;
	private String name;
	private String balance;

	public Indebted(Long id, String name, String balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public Indebted() {

	}
}
