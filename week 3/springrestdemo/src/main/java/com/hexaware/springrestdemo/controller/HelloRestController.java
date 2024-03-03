package com.hexaware.springrestdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// No need to use Response body because RestController= Controller + Response body 
@RestController // mandatory to accept rest api requests from clients
@RequestMapping("/api") // optional best practice
public class HelloRestController {

	@RequestMapping(value ="/hello" , method = RequestMethod.GET)
	public String hello() {
		return "Hello friends from RestAPI";
	}
}
