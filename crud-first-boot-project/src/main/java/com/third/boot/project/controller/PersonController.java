package com.third.boot.project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.third.boot.project.entity.Person;
import com.third.boot.project.service.PersonSerive;

@RestController
public class PersonController 
{
	@Autowired
	private PersonSerive personSerive;
	
	@GetMapping("/persons")
	public Iterable<Person> helloworld()
	{
		
		return personSerive.readAll();
	}
	
	@PostMapping("/persons/create")
	public Person helloworldcreate(@RequestBody Person person )
	{
		
		return personSerive.createPerson(person);
	}
	
	@PostMapping("/persons/delete")
	public void helloworldelete(@RequestBody Person person )
	{
		 personSerive.deletePerson(person);
	}
	
	@DeleteMapping("/persons/creates")
	public Iterable<Person> helloworlcreates(@RequestBody List<Person> persons )
	{
		return  personSerive.createPersons(persons);
	}
	
	@GetMapping("/persons/creates/{start}/{end}")
	public Iterable<Person> helloworldpersonbbyids(@PathVariable("start") int start, @PathVariable("end") int end)
	{
		List<Integer> ids=new ArrayList<>();
		ids.add(start);
		ids.add(end);
		return  personSerive.getPersonByIds(ids);
	}
	
	@PutMapping("/persons/update/{id}/{email}")
	public Person helloworldupdate(@PathVariable("id") int id , @PathVariable("email") String email)
	{
		Person person=personSerive.updatePersonEmailById(id,email);
		return person;		
	}
}
