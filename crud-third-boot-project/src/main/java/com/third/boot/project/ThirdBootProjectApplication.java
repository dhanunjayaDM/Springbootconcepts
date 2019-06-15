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
public class ThirdBootProjectApplication{
//
//	@Autowired
//	private PersonSerive personSerive;
	public static void main(String[] args) {
		SpringApplication.run(ThirdBootProjectApplication.class, args);
	}
//
//	@Override
//	public void run(String... arg0) throws Exception {
//		//deletePerson();
//	updatePersonEmailById();
//		//getPersonByIds();
//	}
//
//	private void updatePersonEmailById() {
//		personSerive.updatePersonEmailById(2,"sudhacse143@gmail.com");
//		
//	}

//	private void deletePerson() {
//		Person person=new Person();
//		person.setId(3);
//		personSerive.deletePerson(person);
//		
//		
//	}
//
//	private void getPersonByIds() {
//		List<Integer> ids=new ArrayList<>();
//		ids.add(2);
//		ids.add(3);
//		
//		
//		Iterable<Person> personlist=personSerive.getPersonByIds(ids);
//		personlist.forEach(System.out::println);
//			
//	}
//
//	private void createPersons() {
//		java.util.List<Person> personlist=(java.util.List<Person>) Arrays.asList(new Person("sudha", "enamala", "sudhacse543@gmail.com", new Date()),
//				new Person("siva", "rama", "sivarama@gmail.com", new Date()));
//		Iterable<Person> personlst=personSerive.createPersons(personlist);
//		System.out.println(personlst);
//		
//		for(Person persn:personlst){
//			System.out.println(persn);
//		}
//		
//	}
//
//	private void readAll() {
//		personSerive.readAll();
//		
//	}
//
//	private void createPerson() {
//		Person person1=new Person("dhana", "mylari", "dhanamylari225@gmail.com", new Date());
//		Person person = personSerive.createPerson(person1);
//		System.out.println(person);
//	}

}
