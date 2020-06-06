package com.Spring_course.Spring_course.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring_course.Spring_course.Service.UserService;
import com.Spring_course.Spring_course.domain.User;
import com.Spring_course.Spring_course.repository.UserRepository;

@RestController
@RequestMapping(value = "/home")
public class UserController {

	private UserService userservice;
	
	@PostMapping
	public ResponseEntity<User> save(@RequestBody User x){
		
		User createdUser = userservice.save(x);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
			
	}
	
	@PostMapping("/{}id")
	public ResponseEntity<User> update (@PathVariable (name = "id")Long id, @RequestBody User x){
		x.setId(id);
		
		User UpdatedUser = userservice.save(x);
		
		return ResponseEntity.ok(UpdatedUser);
	}
	
	
	@PostMapping
	public ResponseEntity<Optional<User>> login (@RequestBody User x){
		Optional <User> Loggeduser = userservice.Login(x.getEmail(), x.getPassword());
		
		return ResponseEntity.ok(Loggeduser);
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<User>> getById(@PathVariable ("id") Long id){
     
	  Optional<User>  user = userservice.getById (id);
	  
	  return ResponseEntity.ok(user);
	
	}

    @GetMapping
    public ResponseEntity<List<User>> listAll(){
    	
    	List<User>userList = userservice.Listall();
    	
    	return ResponseEntity.ok(userList);
    	
    }


    
    
}














