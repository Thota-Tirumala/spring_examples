package com.boot.postman.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.boot.postman.model.Employee;



@Service
public interface EmployeeService {
	
	public Employee saveDetails(Employee emp);
	public List<Employee> getDetails(Employee emp);
	 
	public Employee getById(int eid);
	public void deleteEmpId(int eid);
	

}