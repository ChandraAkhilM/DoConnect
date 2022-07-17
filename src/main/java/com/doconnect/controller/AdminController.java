package com.doconnect.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doconnect.model.User;
import com.doconnect.repository.UserRepository;
import com.doconnect.serviceImpl.UserServiceImpl;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	UserServiceImpl userService;
	
	@GetMapping("/info")
	public List<User> get() {
		return userService.findAllUsers();
	}
	
	@GetMapping("/Approvals")
	public Object setApproved() {
		return null;
	}
	
}
