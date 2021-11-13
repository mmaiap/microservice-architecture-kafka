package com.mmaiap.microservice.userlistener.kafka;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mmaiap.microservice.userlistener.domain.Indebted;
import com.mmaiap.microservice.userlistener.repositories.IndebtedRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class UserListener {
	
	private final ObjectMapper objectMapper;
	
	@Autowired
	private IndebtedRepository repo;
	
	@KafkaListener(topics = "user-debt-input")
	public void readMessage(String message) {
		try {
			UserIndebted userIndebted = objectMapper.readValue(message, UserIndebted.class);
			Indebted user = userIndebted.toDomain();
			repo.save(user);
			
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
