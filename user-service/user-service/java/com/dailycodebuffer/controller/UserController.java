package com.dailycodebuffer.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dailycodebuffer.dto.ResponseDto;
import com.dailycodebuffer.entity.User;
import com.dailycodebuffer.service.UserService;

import jdk.internal.org.jline.utils.Log;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService  userService;
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		
		return userService.saveUser(user);
	}

//	@GetMapping("/{id}")
//	public User getUserById(@PathVariable("id") Long userid) {
//		
//		return userService.findByUserId(userid);
//	}
//	
	@GetMapping("/{id}") 
	public ResponseDto getUserwithDepartment(@PathVariable("id") Long userid) {
		Log.info("Inside department Save COntroller");
		return userService.findResponseDtoByUserId(userid);
	}

	
}
