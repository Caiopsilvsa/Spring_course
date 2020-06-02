package com.Spring_course.Spring_course.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring_course.Spring_course.Enums.RequestState;
import com.Spring_course.Spring_course.domain.Request;
import com.Spring_course.Spring_course.repository.RequestRepository;

@Service
public class RequestService {

	@Autowired
	RequestRepository requestRepository;
	
	
	
	public Request update(Request x) {
		Request updated = requestRepository.save(x);
		return updated;
		
	}
	
	 
	 public Optional <Request> getByid(Long id) {
		Optional<Request> result = requestRepository.findById(id);
		return result;
	 }
		
	public List<Request> listAll(){
		List <Request> listResult = requestRepository.findAll();
		
		return listResult;
		
	}
		
	 
     public List<Request> listAllByOwnerid(Long ownerid){
           List<Request> ownerIdList = requestRepository.findByUserid(ownerid);
           
           return ownerIdList;
    	
    	 
     }


}
	
	
	 

