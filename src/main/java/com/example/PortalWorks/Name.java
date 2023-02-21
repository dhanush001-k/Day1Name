package com.example.PortalWorks;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Name {
	@RequestMapping("/Welcome")
	public String getName() {
		String name="KD";
		return "Welcome "+name+"!";
	}

}
