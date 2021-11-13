package com.mmaiap.microservice.bank.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mmaiap.microservice.bank.entities.User;
import com.mmaiap.microservice.bank.services.BankService;

@RestController
@RequestMapping(value = "/system-bank")
public class BankResource {
	
	@Autowired
	private BankService service;
	
	@RequestMapping(value = "/users",method = RequestMethod.GET)
	public ResponseEntity<List<User>> getUsers(){
		List<User> list = service.getUsers();
		return ResponseEntity.ok(list);
	}
	
	@RequestMapping(value = "/debt",method = RequestMethod.GET)
	public ResponseEntity<List<User>> getUsersWDebt(){
		List<User> list = service.getUsersWDebt();
		
		return ResponseEntity.ok(list);
	}

}
