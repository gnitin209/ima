package com.mindtree.ima.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.mindtree.ima.dto.ErrorResponse;
import com.mindtree.ima.exception.InventoryManagementApplicationException;


public class InventoryManagementHandler {
	@ExceptionHandler(InventoryManagementApplicationException.class)
	public ResponseEntity<ErrorResponse> errorHandler(Exception e) {
		return new ResponseEntity<>(new ErrorResponse(e.getMessage(), e.getCause()),
				HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

}
