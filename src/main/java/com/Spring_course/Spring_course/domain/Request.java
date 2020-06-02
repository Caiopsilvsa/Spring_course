package com.Spring_course.Spring_course.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.Spring_course.Spring_course.Enums.RequestState;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor  @NoArgsConstructor


@Entity
public class Request {
 
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;
      
	  @Column(nullable = false)
	  private String subject;
      
	  @Column (columnDefinition = "text")
	  private String description;
      
	  public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<RequestStage> getStages() {
		return stages;
	}

	public void setStages(List<RequestStage> stages) {
		this.stages = stages;
	}

	public RequestState getState() {
		return state;
	}

	public void setState(RequestState state) {
		this.state = state;
	}

	@Column (name = "creation_date", nullable = false)
	  @Temporal(TemporalType.TIMESTAMP)
	  private Date dateCreation;
      
	  @ManyToOne
	  @JoinColumn(name = "user_id", nullable = false, insertable = false, updatable = false )
      User user;
	  
	  @OneToMany
	  @JoinColumn(name = "resquest_id", nullable = false)
      List <RequestStage> stages = new ArrayList<>();
      
	  @Enumerated(EnumType.STRING)
      RequestState state;

	public void setDateCreation2(Date dateCreation2) {
		this.dateCreation = dateCreation2;
		
	}

	
}

