package com.third.boot.project.dao;

import org.springframework.data.repository.CrudRepository;

import com.third.boot.project.entity.Person;

public interface PersonDao extends CrudRepository<Person, Integer> {

}
