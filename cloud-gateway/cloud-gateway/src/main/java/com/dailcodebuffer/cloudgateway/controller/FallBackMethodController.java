package com.dailcodebuffer.cloudgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
	
	@GetMapping("/userServiceFallBackMethod")
	public String UserServiceFallBackMethod() {
		return "User service is taking longer than expected"
				+"Please Try after some time";
	}
	@GetMapping("/departmentServiceFallBackMethod")
	public String DepartmentServiceFallBackMethod() {
		return "Department service is taking longer than expected"
				+"Please Try after some time";
	}

}
