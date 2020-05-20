package com.Spring_course.Spring_course.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Spring_course.Spring_course.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
	@Query("SELECT FROM User WERE email = ?1 AND Password = ?2")
	public Optional<User> Login(String nome, String email);
	
	
	
}
