package com.third.boot.project.dao;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.scheduling.annotation.Async;

import com.third.boot.project.entity.Person;

public interface PersonDao extends CrudRepository<Person, Integer> {

	

	@Async
	CompletableFuture<Person> findByEmail(String email);
	

}
