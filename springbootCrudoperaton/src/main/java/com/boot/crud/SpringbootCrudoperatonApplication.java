package com.boot.crud;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootCrudoperatonApplication {

	public static void main(String[] args) {
ApplicationContext context=SpringApplication.run(SpringbootCrudoperatonApplication.class, args);
		
		StudentRepositroy srepo = context.getBean(StudentRepositroy.class);
		
		// create student object
		
		Student s = new Student();
		s.setSid(12);
		s.setSname("tiru");
		s.setTech("eee");
		s.setFee(1234);
		
		Student s2 = new Student();
		s2.setSid(13);
		s2.setSname("mahi");
		s2.setTech("java");
		s2.setFee(4335);
		
//		Student result= srepo.save(s2);
//		System.out.println("Student result : "+result);
//		
		List<Student> student = List.of(s,s2);
		
		Iterable<Student> result=srepo.saveAll(student);
		
		result.forEach(students->{
		
				System.out.println("results : "+students);
		});
		System.out.println("success.......");
		
		//update the student
		
		Optional<Student> optional=srepo.findById(12);
		Student s3 = optional.get();
		
		s3.setSname("meena");
		Student result2= srepo.save(s3);
		
		
		System.out.println("update student :"+result2);
		
		//get the all details
		//findById(id)-return optional your data
		
		Iterable<Student> itr = srepo.findAll();
		
		Iterator<Student> iterator = itr.iterator();
		
		while(iterator.hasNext())
		{
			Student s4 = iterator.next();
			System.out.println("total student details : "+s4);
		}
		
//		itr.forEach(null);
	}

}
