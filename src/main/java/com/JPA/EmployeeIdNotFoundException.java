package com.JPA;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(
	value=HttpStatus.NOT_FOUND,
	reason="employee Id not found"
		)
/**
 * 
 * @author trainee
 * Exception handling
 */
public class EmployeeIdNotFoundException extends RuntimeException{
	
}
