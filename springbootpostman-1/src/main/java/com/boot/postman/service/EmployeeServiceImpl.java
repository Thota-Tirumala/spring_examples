package com.boot.postman.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.postman.dao.EmployeeRepository;
import com.boot.postman.model.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepo;

//	@Override
//	public Employee saveDetails(Employee emp) {
//		
//		Employee save = employeeRepo.save(emp);
//		
//		return save;
//	}
	
	@Override
	public Employee saveDetails(Employee b)
	{
	Employee result=employeeRepo.save(b);
	  return result;
	}

	@Override
	public List<Employee> getDetails(Employee emp)
	{
		List<Employee> employee =employeeRepo.findAll();
		
		return employee;
	}

	@Override
	public Employee getById(int eid) {
		
		Employee  emp2= employeeRepo.findById(eid).get();
		return emp2;
	}

	@Override
	public void deleteEmpId(int eid) {
		
		employeeRepo.deleteById(eid);
		
	}

	

	
}