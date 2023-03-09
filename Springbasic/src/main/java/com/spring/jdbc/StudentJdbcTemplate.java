package com.spring.jdbc;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJdbcTemplate implements StudentDao{

	private DataSource datasource;
	private JdbcTemplate jdbcTemplateobject;
	
	
	@Override
	public void setDataSource(DataSource ds) {
		
		this.datasource = datasource;
	    this.jdbcTemplateobject = new JdbcTemplate(datasource);	
	}

	@Override
	public void create(String name, Integer age) {
		
		 String SQL = "insert into Student (name, age) values (?, ?)";
		 
	     jdbcTemplateobject.update( SQL, name, age);
	     
	     System.out.println("Created Record Name = " + name + " Age = " + age);
	}

	@Override
	public Student getStudent(Integer id) {
		
		 String SQL = "select * from Student where id = ?";
	     Student student = jdbcTemplateobject.queryForObject(SQL,new Object[]{id}, new StudentMapp());
	     
		return student;
	}

	@Override
	public List<Student> listStudents() {
		
		String SQL = "select * from Student";
	    List <Student> students = jdbcTemplateobject.query(SQL, new StudentMapp());
		return students;
	}

	@Override
	public void delete(Integer id) {
		
		String SQL = "delete from Student where id = ?";
	      jdbcTemplateobject.update(SQL, id);
	      System.out.println("Deleted Record with ID = " + id );
	      
	      return;
	}

	@Override
	public void update(Integer id, Integer age) {
		
		 String SQL = "update Student set age = ? where id = ?";
	      jdbcTemplateobject.update(SQL, age, id);
	      
	      System.out.println("Updated Record with ID = " + id );
	      
	      return;
		
	}

}
