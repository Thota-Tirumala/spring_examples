package com.boot.model2;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.boot.model.Employee;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO	)
	private int address_id;
	private String city;
	private String state;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Employee employee;
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Address(int address_id, String city, String state) {
		super();
		this.address_id = address_id;
		this.city = city;
		this.state = state;
	}
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [address_id=" + address_id + ", city=" + city + ", state=" + state + "]";
	}
	
	

}
