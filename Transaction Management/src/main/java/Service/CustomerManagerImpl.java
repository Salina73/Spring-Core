
package Service;

import org.springframework.transaction.annotation.Transactional;

import DAO.CustomerDAO;
import com.Model.Customer;

public class CustomerManagerImpl implements CustomerManager {

	private CustomerDAO customerDAO;

	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	@Transactional
	public void createCustomer(Customer cust) {
		customerDAO.create(cust);
	}

}
