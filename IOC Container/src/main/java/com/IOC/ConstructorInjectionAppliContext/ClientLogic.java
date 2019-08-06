package com.IOC.ConstructorInjectionAppliContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientLogic 
{
    public static void main(String args[])
    {
        //Read the configuration file
        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring4.xml");
        
        //Get the Student instance
        Employee employee = (Employee)ac.getBean("employee");
        employee.getEmployeeDetails();
    }
}