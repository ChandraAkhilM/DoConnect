package com.doconnect.service;

import java.util.List;

import com.doconnect.model.User;

public interface UserService {
	List<User> getAllUsers();
	User getUserById(Long user_id);
	List<User> getUserByName(String user_name);
	Boolean getIsAdmin(Long user_id);
}
