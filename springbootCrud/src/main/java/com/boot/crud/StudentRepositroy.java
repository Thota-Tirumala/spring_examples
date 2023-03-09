package com.boot.crud;

import org.springframework.data.repository.CrudRepository;

import com.boot.pojo.Student;

public interface StudentRepositroy extends CrudRepository<Student, Integer>
{

}
