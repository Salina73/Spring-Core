package com.IOC.SetterInjectionBeanFactory;

public class Employee 
{
		private int id;
	    private String name;
	    private String city;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public void getEmployeeDetails()
	    {
	        System.out.println("**Employee Details**");
	        System.out.println("ID : "+id);
	        System.out.println("Name : "+name);
	        System.out.println("City : "+city);
	    }
}
