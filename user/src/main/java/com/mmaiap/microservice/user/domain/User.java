package com.mmaiap.microservice.user.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tb_user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Integer age;
	private Double balance;

	public User(String name, Integer age, Double balance) {
        this.name = name;
        this.age = age;
		this.balance = balance;
    }


	public User() {
	}
}
