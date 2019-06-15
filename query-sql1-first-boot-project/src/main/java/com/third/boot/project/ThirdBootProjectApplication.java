package com.third.boot.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.third.boot.project.entity.Person;
import com.third.boot.project.service.PersonSerive;



@SpringBootApplication
public class ThirdBootProjectApplication implements CommandLineRunner{

	@Autowired
	private PersonSerive personSerive;
	public static void main(String[] args) {
		SpringApplication.run(ThirdBootProjectApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		getPersonsInfoByLastName();
		//getPersonInfoByFirstNameAndEmail();
	}

	private void getPersonInfoByFirstNameAndEmail() {
		// TODO Auto-generated method stub
		List<Person> personlist=personSerive.getPersonInfoByFirstNameAndEmail("dhana","dhanamylari225@gmail.com");
		
		for(Person person:personlist){
			System.out.println(person.getId());
		}
		
	}

	private void getPersonsInfoByLastName() {
		// TODO Auto-generated method stub
		List<Person> personlist=personSerive.getPersonsInfoByLastName("mylari");
		personlist.forEach(System.out::println);
	}

	
}
