package com.Spring_course.Spring_course.domain;


import java.util.Date; 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.Spring_course.Spring_course.Enums.RequestState;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor


@Entity
public class RequestStage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	
	@Column (columnDefinition = "text")
	private String description;
	
    @Column (name = "creation_date", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date realizationDate;
	
    @Enumerated(EnumType.STRING)
	private RequestState state;
	
	@ManyToOne
	@JoinColumn(name = "request_id", nullable = false)
	private Request request;
	
	@ManyToOne
	@JoinColumn(name = "owner_id",nullable = false, insertable = false, updatable = false)
	private User ower;
	
	
	
	
	
	
	
	

}
