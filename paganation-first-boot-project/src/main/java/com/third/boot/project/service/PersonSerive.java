package com.third.boot.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.third.boot.project.dao.PersonDao;
import com.third.boot.project.entity.Person;

@Service
public class PersonSerive {
	@Autowired
	private PersonDao personDao;

	public List<Person> findByLastName(String lastname, PageRequest pageRequest) {
		// TODO Auto-generated method stub
		return personDao.findByLastName(lastname,pageRequest);
	}

	

	


}
