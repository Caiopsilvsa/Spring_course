package com.Spring_course.Spring_course.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring_course.Spring_course.domain.User;
import com.Spring_course.Spring_course.repository.UserRepository;

@Service
public class UserService {
   
	 @Autowired
	 UserRepository userRepository;
	 
	 public User save(User x) {
		 User CreatedUser = userRepository.save(x);
		 return CreatedUser;
		 
		 
	 }

	 
	public User update(User x) {
		User UpdatedUser = userRepository.save(x);
		return UpdatedUser;
		
		}
	
	public Optional<User> getById(Long id) {
	  Optional <User>result = userRepository.findById(id);
	  return result;
	}	
		
	
	public List<User>Listall( ){
		List<User>resultList = userRepository.findAll();
		return resultList;
		
	}
	  
	
	public  Optional<User> Login(String email, String Password){	
		Optional <User> loginCreated = userRepository.login(email, Password);
		return loginCreated;
		
	}
	
	
	
}
