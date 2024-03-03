package com.hexaware.cricketmanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(PlayerNotFoundException.class)
	@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="player has not registered")
	public void handleExp() {
		//return new ResponseEntity<String>("Player not found",HttpStatus.NOT_FOUND);
	}
}
