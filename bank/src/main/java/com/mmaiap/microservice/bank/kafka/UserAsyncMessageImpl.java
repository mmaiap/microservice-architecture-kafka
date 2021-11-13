package com.mmaiap.microservice.bank.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mmaiap.microservice.bank.entities.Indebted;
import com.mmaiap.microservice.bank.entities.User;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class UserAsyncMessageImpl implements UserAsyncMessage{
	
	private final KafkaTemplate<String, String> kafkaTemplate;
	
	private final ObjectMapper objectMapper;

	@Override
	public void sendMessage(User user) {
		String message = toJson(user);
		kafkaTemplate.send("user-debt-input", message);
		
	}
	
	private String toJson(User user) {
		
		try {
			return objectMapper.writeValueAsString(new Indebted(user));
		} catch (JsonProcessingException e) {
			throw new RuntimeException(e.getMessage());
		}
	}

}
