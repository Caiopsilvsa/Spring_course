package com.Spring_course.Spring_course.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Spring_course.Spring_course.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	@Query(value = "SELECT * FROM User WHERE  email =?1 AND Pasword = ?2", nativeQuery = true)
	public Optional<User> login(String email, String Pasword);
	

	
	
	
}
