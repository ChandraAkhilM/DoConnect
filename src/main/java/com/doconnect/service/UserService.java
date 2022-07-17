package com.doconnect.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.doconnect.model.User;

public interface UserService {
	ResponseEntity<User> getAllUsers();
	User getUserById(Long user_id);
	ResponseEntity<User> getUserByName(String user_name);
	Boolean getIsUserAdmin(Long user_id);
}
