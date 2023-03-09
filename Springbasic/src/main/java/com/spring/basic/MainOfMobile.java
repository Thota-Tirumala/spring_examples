package com.spring.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainOfMobile {
	
	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("springcore.xml");
		
		Mobile mobile = (Mobile) context.getBean("mobile");

		System.out.println(mobile);
	}

}
