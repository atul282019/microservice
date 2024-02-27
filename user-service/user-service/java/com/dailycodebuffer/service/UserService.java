package com.dailycodebuffer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dailycodebuffer.dto.DepartmentDto;
import com.dailycodebuffer.dto.ResponseDto;
import com.dailycodebuffer.entity.User;
import com.dailycodebuffer.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}
	public User findByUserId(Long userid) {
		// TODO Auto-generated method stub
		return userRepository.findByUserId(userid);
	}
	public ResponseDto findResponseDtoByUserId(Long userid) {
		
		ResponseDto responsedto = new ResponseDto();
		User user = userRepository.findByUserId(userid);
		
	  String  url = "http://localhost:9090/departments/"; 
		DepartmentDto department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+"1", DepartmentDto.class);
		
		responsedto.setDepartment(department);
		responsedto.setUser(user);
		return responsedto;
		
		}

}
