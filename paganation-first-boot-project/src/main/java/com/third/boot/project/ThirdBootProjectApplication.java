package com.third.boot.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;

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
		List<Person> list=personSerive.findByLastName("mylari",new PageRequest(0, 1, Direction.ASC, "firstName"));
		list.forEach(System.out::println);
	}

	

	
}
