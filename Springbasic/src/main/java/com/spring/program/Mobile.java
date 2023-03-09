package com.spring.program;

import org.springframework.stereotype.Component;

@Component
public class Mobile {

	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + "]";
	}
	
	
}
