package com.third.boot.project.service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.third.boot.project.dao.PersonDao;
import com.third.boot.project.entity.Person;

@Service
public class PersonSerive {
	@Autowired
	private PersonDao personDao;

	public void updatePersonEmailById(int id, String newEmail) {
		// TODO Auto-generated method stub
		personDao.updatePersonEmailById(id,newEmail);
	}


	

	

	


}
