package com.third.boot.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.third.boot.project.entity.Person;

public interface PersonDao extends CrudRepository<Person, Integer> {
	@Query(value="Select * from person_table where last_name =?1",nativeQuery=true)
	List<Person> findByLastName(String lastName);

	@Query(value="Select * from person_table where first_name=?1 AND email=?2",nativeQuery=true)
	List<Person> findByFirstNameAndEmail(String firstName, String email);

}
