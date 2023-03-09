package com.boot.postman.dao;
import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.postman.model.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
