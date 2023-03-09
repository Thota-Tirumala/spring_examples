package com.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.boot.Repository.EmployeeRepository;
import com.boot.model.Employee;
import com.boot.model2.Address;

@SpringBootApplication
public class Springboot1to1Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Springboot1to1Application.class, args);
	}

	@Autowired
	private EmployeeRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		// user object
		Employee user = new Employee();
		user.setEname("Ramesh");
		user.setDepartment("java");
		user.setSal(123456);
		
		Address address = new Address();
		address.setAddress_id(11);
		address.setCity("hyderabad");
		address.setState("telangana");
		
		user.setAddress(address);
		address.setEmployee(user);
		
		userRepository.save(user);
	}
}
