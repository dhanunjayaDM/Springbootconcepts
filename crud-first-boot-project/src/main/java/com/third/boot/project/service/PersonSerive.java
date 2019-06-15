package com.third.boot.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.third.boot.project.dao.PersonDao;
import com.third.boot.project.entity.Person;

@Service
@Transactional
public class PersonSerive {
	@Autowired
	private PersonDao personDao;

	
	public Person createPerson(Person person1) {
		return personDao.save(person1);
	}

	public Iterable<Person> readAll() {
		return personDao.findAll();
		
	}

	public Iterable<Person> createPersons(List<Person> personlist) {
		return (Iterable<Person>) personDao.save(personlist);
		
	}

	public Iterable<Person> getPersonByIds(List<Integer> ids) {
		Iterable<Person> persons=personDao.findAll(ids);
		
		return persons;
	}

	public void deletePerson(Person person) {
		// TODO Auto-generated method stub
		personDao.delete(person);
	}

	public Person updatePersonEmailById(int id, String newemail) {
		// TODO Auto-generated method stub
		Person person=personDao.findOne(id);
		if(id==person.getId()){
			person.setEmail(newemail);
		}
		return personDao.save(person);
	}

	

}
