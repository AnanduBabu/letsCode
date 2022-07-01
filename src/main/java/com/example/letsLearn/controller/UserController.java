package com.example.letsLearn.controller;

import java.util.List;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.letsLearn.dto.requestDTO.UserRequestDTO;
import com.example.letsLearn.entity.User;
import com.example.letsLearn.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/{documentId}")
	public User getUsers(@PathVariable String documentId) throws InterruptedException, ExecutionException {
		 return userService.getUsers(documentId);	
	}
	
	@GetMapping
	public String test()  {
		 return "Working";	
	}
	
	@GetMapping("/all")
	public List<User> allUsers()  {
		 return userService.getAllUsers();	
	}
	
	@PostMapping
	public User adduser(@RequestBody UserRequestDTO request) {
		return userService.addUser(request);
	}
	
}
