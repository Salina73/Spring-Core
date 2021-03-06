package com.IOC.ConstructorInjectionBeanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class ClientLogic 
{
    public static void main(String args[])
    {
        //Read the configuration file
        Resource resource = new ClassPathResource("Spring3.xml");
        
        //Read all the bean definition
        @SuppressWarnings("deprecation")
		BeanFactory bf = new XmlBeanFactory(resource);
        
        //Get the Student instance
        Employee employee = (Employee)bf.getBean("employee");
        employee.getEmployeeDetails();
    }
}