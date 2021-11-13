package com.mmaiap.microservice.bank.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mmaiap.microservice.bank.entities.User;

@Component
@FeignClient(name = "user", path = "/users")
public interface UserFeignClient {
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll();

}
