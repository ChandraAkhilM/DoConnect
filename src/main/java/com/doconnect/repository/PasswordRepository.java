package com.doconnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doconnect.model.Password;

@Repository
public interface PasswordRepository extends JpaRepository<Password, Long>{

}
