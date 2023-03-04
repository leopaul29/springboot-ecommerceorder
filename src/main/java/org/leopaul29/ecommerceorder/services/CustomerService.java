package org.leopaul29.ecommerceorder.services;

import org.leopaul29.ecommerceorder.entities.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    Customer saveCustomer(Customer customer);

    Optional<Customer> getCustomerById(Long id);

    Customer getCustomerByName(String name);

    List<Customer> getAllCustomer();

    Customer updateCustomer(Customer updatedCustomer);

    void deleteCustomerById(Long id);
}
