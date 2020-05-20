package com.Spring_course.Spring_course.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Spring_course.Spring_course.Enums.RequestState;
import com.Spring_course.Spring_course.domain.Request;
import com.Spring_course.Spring_course.domain.RequestStage;

@Repository
public interface RequestStageRepository extends JpaRepository<RequestStage, Long> {


	@Query(value = "SELECT * FROM Request WHERE id = ?1" , nativeQuery = true)
	public List<RequestStage> findByRequestid(Long id);
	
	
	
	
}
