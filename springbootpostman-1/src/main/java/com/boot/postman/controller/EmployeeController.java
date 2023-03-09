package com.boot.postman.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.postman.model.Employee;
import com.boot.postman.service.EmployeeService;



@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService empserv;
	
//	@PostMapping("add")
//	public ResponseEntity<String> saveEmployee(@RequestBody Employee emp){
//		
//		Employee saveDetails = empserv.saveDetails(emp);
//		
//		return new ResponseEntity<>(HttpStatus.OK);
//	}

	@PostMapping("/add")
	public Employee addBook(@RequestBody Employee bo)
	{
    Employee k= this.empserv.saveDetails(bo);
    return k;
	}
	
	@GetMapping("/showAll")
	public ResponseEntity<List<Employee>> saveEmployee(@RequestBody Employee emp){
		
		List<Employee> employeelist= empserv.getDetails(emp);
		
		return new ResponseEntity<List<Employee>>(employeelist, HttpStatus.OK);
	}
	
	@GetMapping("/show/{eid}")
	public ResponseEntity<Employee> getEmpId(@PathVariable("eid") int eid){
		
		Employee employee= empserv.getById(eid);
		
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}
	
	@DeleteMapping("/del/{eid}")
	public ResponseEntity<Void> deleteEmpId(@PathVariable("eid") int eid){
		
		 empserv.deleteEmpId(eid);
		
		return new ResponseEntity<Void>( HttpStatus.ACCEPTED);
	}
}