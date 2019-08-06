
package com.Main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Service.Service;

public class Main {

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Spring.xml");
		Service employeeService = ctx.getBean("employeeService", Service.class);
		
		System.out.println(employeeService.getEmployee().getName());
		
		employeeService.getEmployee().setName("Sallu");
		
		employeeService.getEmployee().throwException();
		
		ctx.close();
	}
}
