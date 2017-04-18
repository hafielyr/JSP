package com.JPA;

import java.util.AbstractMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * 
 * @author trainee
 * Controller for Employee
 */
@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepository er;
	
	@RequestMapping(value = "employees/{empId}/score", method = RequestMethod.GET)
    AbstractMap.SimpleEntry<String, Double> getEmployeeByFilter(@PathVariable long empId) {
        
		if(er.findOne(empId) != null){
        double result = calculateScore();
        return new AbstractMap.SimpleEntry<String, Double>("score", result);}
		else{
			throw new EmployeeIdNotFoundException();
		}
    }
	
	private double calculateScore(){
		return Math.random();
	}
}
