package com.third.boot.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.scheduling.annotation.EnableAsync;

import com.third.boot.project.entity.Person;
import com.third.boot.project.service.PersonSerive;



@SpringBootApplication
@EnableAsync
public class ThirdBootProjectApplication implements CommandLineRunner{

	@Autowired
	private PersonSerive personSerive;
	public static void main(String[] args) {
		SpringApplication.run(ThirdBootProjectApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		CompletableFuture<Person>  completableFuture= personSerive.findByEmail("dhanamylari225@gmail.com");
		Person person=completableFuture.get(20, TimeUnit.SECONDS);
		System.out.println(person);
	}

	

	
}
