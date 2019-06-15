package com.third.boot.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.third.boot.project.entity.Person;

public interface PersonDao extends CrudRepository<Person, Integer> {
	
	List<Person> findByLastName(String lastName);

	
	List<Person> findByFirstNameAndEmail(String firstName, String email);

}
