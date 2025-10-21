package space.springbok.spring6restmvc.services;

import space.springbok.spring6restmvc.model.Customer;

import java.util.List;
import java.util.UUID;

/**
 *
 * @author John Spangenberg
 */
public interface CustomerService {

    List<Customer> listCustomers();

    Customer getCustomerById(UUID id);

    Customer saveNewCustomer(Customer customer);
}
