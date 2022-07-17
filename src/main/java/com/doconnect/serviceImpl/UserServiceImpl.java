package com.doconnect.serviceImpl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.doconnect.model.User;
import com.doconnect.repository.UserRepository;
import com.doconnect.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User getUserById(Long user_id) {
		Optional<User> user = userRepository.findById(user_id);
		return user.isPresent() ? user.get() : null;
	}

	@Override
	public List<User> getUserByName(String user_name) {
		User exampleUser = User.builder()
				.userName(user_name).build();
		ExampleMatcher nameMatcher = ExampleMatcher.matching().withMatcher("user_name", 
				ExampleMatcher.GenericPropertyMatchers.ignoreCase().contains())
				.withIgnorePaths("id", "role", "email");
		Example<User> nameExample = Example.of(exampleUser, nameMatcher)
		List<User> users = userRepository.findAll();
		return users;
	}

	@Override
	public Boolean getIsAdmin(Long user_id) {
		Optional<User> user = userRepository.findById(user_id);
		return user.isPresent() ? 
				Boolean.valueOf(user.get().getRole()=="admin") : Boolean.FALSE;
	}

}
