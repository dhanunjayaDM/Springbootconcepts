package com.third.boot.project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController 
{
	@RequestMapping("/hello")
	public String helloworld()
	{
		return "Hello world";
	}
	
	

}
