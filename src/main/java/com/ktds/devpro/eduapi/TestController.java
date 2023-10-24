package com.ktds.devpro.eduapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping(value="/")
	public String hello() {
		return "Hello, World";
	}
}
