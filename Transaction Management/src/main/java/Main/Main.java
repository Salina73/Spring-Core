
package Main;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Model.Address;
import com.Model.Customer;
import Service.CustomerManager;
import Service.CustomerManagerImpl;

public class Main {

	public static void main(String[] args) 
	{
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring.xml");

		CustomerManager customerManager = ctx.getBean("customerManager",
				CustomerManagerImpl.class);

		Customer cust = createDummyCustomer();
		customerManager.createCustomer(cust);

		ctx.close();
	}

	private static Customer createDummyCustomer() 
	{
		Scanner s=new Scanner(System.in);
		Customer customer = new Customer();
		
		System.out.println("Enter name:");
		customer.setName(s.nextLine());
		
		Address address = new Address();
		System.out.println("Enter address:");
		address.setCountry("India");
		// setting value more than 20 chars, so that SQLException occurs
		address.setAddress(s.nextLine());
		customer.setAddress(address);
		return customer;
	}

}
