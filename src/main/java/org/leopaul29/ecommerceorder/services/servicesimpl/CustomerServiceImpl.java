package org.leopaul29.ecommerceorder.services.servicesimpl;

import org.leopaul29.ecommerceorder.entities.Customer;
import org.leopaul29.ecommerceorder.repositories.CustomerRepository;
import org.leopaul29.ecommerceorder.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository repository;

    @Override
    public Customer saveCustomer(Customer customer) {
        Optional<Customer> savedCustomer = repository.findByName(customer.getName());
        if (savedCustomer.isPresent()) {
            System.err.println("Customer already exist");
            //throw new ResourceNotFoundException("Customer already exist with given name:" + customer.getName());
        }
        return repository.save(customer);
    }

    @Override
    public Optional<Customer> getCustomerById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Customer getCustomerByName(String name) {
        return repository.findByName(name).get();
    }

    @Override
    public List<Customer> getAllCustomer() {
        return repository.findAll();
    }


    @Override
    public Customer updateCustomer(Customer updatedCustomer) {
        return repository.save(updatedCustomer);
    }

    @Override
    public void deleteCustomerById(Long id) {
        repository.deleteById(id);
    }

}
