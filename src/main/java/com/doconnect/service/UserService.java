package com.doconnect.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doconnect.model.User;
import com.doconnect.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAllUsers() {
		List<User> users = userRepository.findAll();
		if(users!=null && !users.isEmpty()) {
			return users;
		}
		User user = new User(2L, "king", "admin");
		return Arrays.asList(user);
	}
			
	public User findById(Long id) {
		Optional<User> user = userRepository.findById(id);
		if(user.isPresent()) {
			return user.get();
		}
		return null;
	}
	
	
}
