package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("Springjdbc.xml");

	      StudentJdbcTemplate studentTemplate =(StudentJdbcTemplate)context.getBean("StudentJdbcTemplate");
	      
	      System.out.println("------Records Creation--------" );
	      
	      studentTemplate.create("tiru", 16);
	      studentTemplate.create("mahi", 22);
	      studentTemplate.create("nilesh", 34);

	      System.out.println("------Listing Multiple Records--------" );
	      List<Student> students = studentTemplate.listStudents();
	      
	      for (Student record : students) {
	    	  
	         System.out.print("ID : " + record.getId() );
	         System.out.print(", Name : " + record.getName() );
	         System.out.println(", Age : " + record.getAge());
	      }

	      System.out.println("----Updating Record with ID = 2 -----" );
	      
	      studentTemplate.update(2, 20);

	      System.out.println("----Listing Record with ID = 2 -----" );
	      
	      Student student = studentTemplate.getStudent(2);
	      
	      System.out.print("ID : " + student.getId() );
	      System.out.print(", Name : " + student.getName() );
	      System.out.println(", Age : " + student.getAge());
	}

}
