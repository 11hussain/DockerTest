package com.docker.test.DockerTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
//@RequestMapping(value="/")
public class TestController {
	
	
	 @GetMapping("/getNs")
	 //@RequestMapping(value = "/authenticate", method = RequestMethod.GET)
	public String getName()
	{
		return "Hello Docker";
	}

}
