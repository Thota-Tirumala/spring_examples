package com.boot.crud;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepositroy extends CrudRepository<Student, Integer> {
	

}
