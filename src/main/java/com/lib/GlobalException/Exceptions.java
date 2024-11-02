package com.lib.GlobalException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.lib.Exception.BookAlredyExistException;

@ControllerAdvice
public class Exceptions {
	@ExceptionHandler(BookAlredyExistException.class)
	public ResponseEntity<?> handlesBooksAlreadyExistsException(BookAlredyExistException ex) {
		return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
		
	}

}
