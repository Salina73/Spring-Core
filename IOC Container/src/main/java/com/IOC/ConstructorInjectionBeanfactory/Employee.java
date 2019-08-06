package com.IOC.ConstructorInjectionBeanfactory;

public class Employee 
{
		private int id;
	    private String name;
	    private String city;
	   
	   

	    
		public void getEmployeeDetails()
	    {
	        System.out.println("**Employee Details**");
	        System.out.println("ID : "+id);
	        System.out.println("Name : "+name);
	        System.out.println("City : "+city);
	    }
}
