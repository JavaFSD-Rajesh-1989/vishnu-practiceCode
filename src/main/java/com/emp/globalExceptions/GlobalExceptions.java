package com.emp.globalExceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.emp.Exception.EmailAlreadyExistsException;

@ControllerAdvice
public class GlobalExceptions {
	@ExceptionHandler(EmailAlreadyExistsException.class)
	public ResponseEntity<?> hanldeExceptions(EmailAlreadyExistsException ex){
		return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
		
	}

}
