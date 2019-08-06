package com.IOC.SetterInjectionBeanFactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientLogic 
{
    public static void main(String args[])
    {
        //Read the configuration file
        Resource resource = new ClassPathResource("Spring1.xml");
        //Read all the bean definition
        @SuppressWarnings("deprecation")
		BeanFactory bf = new XmlBeanFactory(resource);
        //Get the Student instance
        Employee employee = (Employee)bf.getBean("employee");
        employee.getEmployeeDetails();
    }
}