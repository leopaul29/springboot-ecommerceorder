package org.leopaul29.ecommerceorder.repositories;

import jakarta.annotation.Resource;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.leopaul29.ecommerceorder.entities.Customer;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class CustomerRepositoryTest {
    @Resource
    private CustomerRepository customerRepository;

    @Test
    public void givenCustomer_whenSave_thenSavedCustomer() {
        Customer customer = Customer.builder().name("Alex").build();

        Customer savedCustomer = customerRepository.save(customer);

        Assertions.assertNotNull(savedCustomer);
        Assertions.assertNotNull(savedCustomer.getId());
    }
}
