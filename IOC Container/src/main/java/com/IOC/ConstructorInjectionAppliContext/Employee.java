package com.IOC.ConstructorInjectionAppliContext;

public class Employee 
{
		private int id;
	    private String name;
	    private String city;
		
	    public Employee(int id, String name, String city)
	    {
	        this.id=id;
	        this.name=name;
	        this.city=city;
	    }
	    
		public void getEmployeeDetails()
	    {
	        System.out.println("**Employee Details**");
	        System.out.println("ID : "+id);
	        System.out.println("Name : "+name);
	        System.out.println("City : "+city);
	    }
}
