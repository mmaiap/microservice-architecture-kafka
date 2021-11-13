package com.mmaiap.microservice.user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mmaiap.microservice.user.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
