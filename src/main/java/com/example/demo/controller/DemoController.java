package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController 
{
	@GetMapping("/demo")
	public String demo()
	{
		return "Welcome to java programming";
	}
	
	@GetMapping("/get")
	public String sayHello()
	{
		return "Hello Ganesh S. Pawar";
	}
	@GetMapping("/get1")
	public String sayHello1()
	{
		return "Hello Pawar Family";
	}
}
