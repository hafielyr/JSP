package com.JPA;

import java.util.List;
import com.JPA.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.data.repository.CrudRepository;

/**
 * 
 * @author trainee
 * EmployeeRepoistory interface
 */
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long>{
	public List<Employee> findByLastName(@Param(value="lastName") String lastName);
	public List<Employee> findByFirstNameAndLastName(String lastName,String firstName);
	
}
