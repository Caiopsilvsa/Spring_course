package com.Spring_course.Spring_course.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring_course.Spring_course.Enums.RequestState;
import com.Spring_course.Spring_course.domain.RequestStage;
import com.Spring_course.Spring_course.repository.RequestRepository;
import com.Spring_course.Spring_course.repository.RequestStageRepository;

@Service
public class RequestStageService {

	@Autowired
	RequestStageRepository requestStageRepository;
	 
	@Autowired
	RequestRepository requestrepository;
	
	
	  public RequestStage save(RequestStage x) {
		  x.setRealizationDate(new Date());
		   	 	
		  RequestStage createdStage = requestStageRepository.save(x);
		  
	      Long requestId = x.getRequest().getId();
	      
	      RequestState state = x.getState();
	      requestrepository.updateStatus(requestId, state);
	      
          return  createdStage;	      
		  
	  }

	  public RequestStage getById(Long id) {
		 
		  Optional<RequestStage> result = requestStageRepository.findById(id);
		  return result.get();
		  
	  }
	  
	  
	  public List<RequestStage> listAllByOwnerId(Long RequestId){
		  
		  List <RequestStage> resultList = requestStageRepository.findByRequestid(RequestId);
		  
		  return resultList;
		  
		  
	  }
	  
}

