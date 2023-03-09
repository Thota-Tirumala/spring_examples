package com.spring.program;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.metrics.ApplicationStartup;

/**
 * Hello world!
 * 
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//    	Car obj = (Car) context.getBean("car");
//    	obj.drive();
//    	Bike obj1=(Bike) context.getBean("bike");
//    	obj1.drive();
    	
    	Mobile mobile = (Mobile) context.getBean("mobile");
    	
    	System.out.println(mobile);
    }
}
