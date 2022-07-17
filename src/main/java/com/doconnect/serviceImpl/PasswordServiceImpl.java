package com.doconnect.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doconnect.model.Password;
import com.doconnect.repository.PasswordRepository;
import com.doconnect.service.PasswordService;

@Service
public class PasswordServiceImpl implements PasswordService{

	@Autowired
	private PasswordRepository passwordRepository;
	
	@Override
	public Boolean isValidPassword(Long user_id, String password) {
		Optional<Password> psswd = passwordRepository.findById(user_id);
		return psswd.isPresent() ? 
				Boolean.valueOf(psswd.get().equals(password)) : Boolean.FALSE;
				
	}

}
