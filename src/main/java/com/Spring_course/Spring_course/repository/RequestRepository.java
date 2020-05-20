package com.Spring_course.Spring_course.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Spring_course.Spring_course.Enums.RequestState;
import com.Spring_course.Spring_course.domain.Request;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long>{

	
	@Query(value = "SELECT * FROM User WHERE id = ?1", nativeQuery = true)
	public List<Request> findByUserid(Long id);

    
	@Query(value = "UPDATE Request SET state = ?2 WHERE id = ?1 " , nativeQuery = true)
	public Request updateStatus(Long id, RequestState state);

	
}
