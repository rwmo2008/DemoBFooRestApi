package com.fdmgroup.demoAFooRestApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/foo")
public class BFooRestController {
	
	@GetMapping("/message")
	public String getMessage() {
		return "Foo message here.";
	}
}
