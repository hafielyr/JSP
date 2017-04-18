package com.JPA;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;
/**
 * 
 * @author trainee
 * Class Employee
 */
@Entity
@Table(name="employee")
public class Employee {
	@javax.persistence.Id
	@Column(name="emp_id")
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long empId;
	@Column(name="first_name", nullable = false)
    private String firstName;
    @Column(name="last_name", nullable = false)
    private String lastName;
    @Column(name="gender", nullable = false)
    private String gender;
    @Column(name="dob")
    private Date dob;
    //@OneToMany(mappedBy="employee", cascade = CascadeType.ALL)
    //private Set<OfficeLocation> officeLocations;
    /**
     * getter of empId
     * @return long
     */
    public long getEmpId() {
		return empId;
	}
    /**
     * setter of empId
     * @param empId
     */
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	/**
	 * getter of firstName
	 * @return String
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * setter of firstName
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * getter of lastName
	 * @return String
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * setter of lastName
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * getter of gender
	 * @return String
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * setter of gender
	 * @param gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * getter of date of birth
	 * @return Date
	 */
	public Date getDob() {
		return dob;
	}	
	/**
	 * setter of date of birth
	 * @param dob
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}
    public Employee(){
    	
    }
}

