package com.third.boot.project.dao;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;

import com.third.boot.project.entity.Person;

public interface PersonDao extends CrudRepository<Person, Integer> {

    @Query(value="select p from Person p where p.firstName=:firstname Or p.lastName=:lastname")
	List<Person> findByLastNameOrFirstName(@Param("lastname")String lastName,@Param("firstname")String firstName);
	

}
