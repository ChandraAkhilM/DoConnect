package com.doconnect.service;

public interface PasswordService {
	Boolean isValidPassword(Long user_id, String password);
}
