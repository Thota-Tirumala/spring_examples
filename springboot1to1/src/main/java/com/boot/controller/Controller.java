//package com.boot.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import com.boot.model.Employee;
//import com.boot.service.EmployeeService;
//
//
//public class Controller {
//	
//	@Autowired
//	private EmployeeService empserv;
//	
////	@PostMapping("add")
////	public ResponseEntity<String> saveEmployee(@RequestBody Employee emp){
////		
////		Employee saveDetails = empserv.saveDetails(emp);
////		
////		return new ResponseEntity<>(HttpStatus.OK);
////	}
//
//	@PostMapping("/add")
//	public Employee addBook(@RequestBody Employee bo)
//	{
//    Employee k= this.empserv.saveDetails(bo);
//    return k;
//	}
//	
//	@GetMapping("/showAll")
//	public ResponseEntity<List<Employee>> saveEmployee(@RequestBody Employee emp){
//		
//		List<Employee> employeelist= empserv.getDetails(emp);
//		
//		return new ResponseEntity<List<Employee>>(employeelist, HttpStatus.OK);
//	}
//	
//
//}
