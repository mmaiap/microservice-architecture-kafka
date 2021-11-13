package com.mmaiap.microservice.userlistener.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mmaiap.microservice.userlistener.domain.Indebted;

@Repository
public interface IndebtedRepository extends JpaRepository<Indebted, Long>{

}
