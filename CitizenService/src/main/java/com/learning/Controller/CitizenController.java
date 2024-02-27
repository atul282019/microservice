package com.learning.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CitizenController {

	@GetMapping(path="/getmessage")
	public ResponseEntity<String> getMessage(){
		
		return new ResponseEntity<>("Hello",HttpStatus.OK);
	}
	
	@GetMapping("/hello")
	public ResponseEntity<String> hello(){
		
		return new ResponseEntity<>("Hello",HttpStatus.OK);
	}
}
