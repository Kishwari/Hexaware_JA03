package com.hexaware.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/webapp")   //(optional) url pattern localhost:8080/webapp
public class MyController {

	
	@RequestMapping("/hello") // mandatory to know which method or service to be executed
	@ResponseBody // in web apps mandatory
	public String sayHello() {		// url pattern  localhost:8080/webapp/hello
		return "Hello friends !";
	}
	
	@RequestMapping(value="/show",method=RequestMethod.GET) // not mandatory .GET part just to explain
	@ResponseBody
	public String show() {
		return "<h1 style='color:red'>Welcome to WEB </h1>";
	}
	
	
}
