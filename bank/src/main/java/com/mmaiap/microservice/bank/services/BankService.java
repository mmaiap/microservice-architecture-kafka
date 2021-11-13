package com.mmaiap.microservice.bank.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mmaiap.microservice.bank.entities.User;
import com.mmaiap.microservice.bank.feignclients.UserFeignClient;
import com.mmaiap.microservice.bank.kafka.UserAsyncMessageImpl;

@Service
public class BankService {

	@Autowired
	private UserFeignClient userFeignClient;
	
	@Autowired
	private UserAsyncMessageImpl userAsyncMessage;

	public List<User> getUsers() {
		List<User> list = userFeignClient.findAll().getBody();
		return list;
		}
	
	public List<User> getUsersWDebt() {
		List<User> debt = new ArrayList<>();
		List<User> list = getUsers();
		
		for (User user : list) {
			if(user.getBalance() < 0) {
				debt.add(user);
				userAsyncMessage.sendMessage(user);
			}
		}
		return debt;
	}
}
