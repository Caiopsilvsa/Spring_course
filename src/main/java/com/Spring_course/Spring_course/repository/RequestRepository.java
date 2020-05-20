package com.Spring_course.Spring_course.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Spring_course.Spring_course.domain.Request;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long>{

	
	@Query ("SELECT  WHERE  ")
	public List <Request> FindByOwnerId(Long id);
	
}
