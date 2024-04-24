package com.matheusGabriel1234.Project.resources.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.matheusGabriel1234.Project.services.exception.ObjectNotFound;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandle {
	
	@ExceptionHandler(ObjectNotFound.class)
	public ResponseEntity<ExceptionFindById> objectNotFound(ObjectNotFound onf, HttpServletRequest httpReq){
		HttpStatus status = HttpStatus.NOT_FOUND;
		ExceptionFindById error = new ExceptionFindById(System.currentTimeMillis(),status.value(),"Objeto não encontrado",onf.getMessage(),httpReq.getRequestURI());
		return ResponseEntity.status(status).body(error);
		
				
		
	}

}
