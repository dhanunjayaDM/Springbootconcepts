package com.third.boot.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.third.boot.project.dao.PersonDao;
import com.third.boot.project.entity.Person;

@Service
public class PersonSerive {
	@Autowired
	private PersonDao personDao;

	public List<Person> getPersonsInfoByLastName(String lastName) {
		// TODO Auto-generated method stub
		return personDao.findByLastName(lastName);
	}

	public List<Person> getPersonInfoByFirstNameAndEmail(String firstName, String email) {
		return personDao.findByFirstNameAndEmail(firstName,email);
		// TODO Auto-generated method stub
		
	}

	


}
