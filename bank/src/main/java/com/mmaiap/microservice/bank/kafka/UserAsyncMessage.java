package com.mmaiap.microservice.bank.kafka;

import com.mmaiap.microservice.bank.entities.User;

public interface UserAsyncMessage {
	
	void sendMessage(User user);
}
