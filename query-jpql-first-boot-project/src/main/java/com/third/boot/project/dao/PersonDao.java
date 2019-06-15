package com.third.boot.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.third.boot.project.entity.Person;

public interface PersonDao extends CrudRepository<Person, Integer> {
	@Query(value="Select p from Person p where p.lastName=?1")
	List<Person> findByLastName(String lastName);

	@Query(value="Select p from Person p where p.firstName=?1 AND email=?2")
	List<Person> findByFirstNameAndEmail(String firstName, String email);

}
