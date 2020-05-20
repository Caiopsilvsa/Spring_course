package com.Spring_course.Spring_course.domain;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.Spring_course.Spring_course.Enums.Role;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor


@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column(nullable = false)
	String name;
	
	@Column(nullable = false)
	String email;
	
	@Column(nullable = false)
	String Password;
	
	@Enumerated(EnumType.STRING)
	Role role;
	
	@OneToMany
	@JoinColumn(name = "user_id", nullable = false)
	List<Request> requests = new ArrayList<>();
	
	@OneToMany
	@JoinColumn(name = "owner_id", nullable = false)
	List<RequestStage> stages = new ArrayList<>();
	
	

	
	
}
