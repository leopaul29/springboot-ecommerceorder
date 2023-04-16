package org.leopaul29.ecommerceorder.repositories;

import jakarta.persistence.EntityManager;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.leopaul29.ecommerceorder.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class CustomerRepositoryTest {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private EntityManager entityManager;
    @Autowired
    private CustomerRepository customerRepository;
    private Customer customer;

    @BeforeEach
    public void setup() {
        customer = Customer.builder().name("Alex").build();
    }
    
    @Test
    public void givenCustomer_whenSave_thenSavedCustomer() {
        // given - setup or precondition
        Customer customer = Customer.builder().name("Bernard").build();

        // when - action or the testing
        Customer savedCustomer = customerRepository.save(customer);

        // then - very output
        Assertions.assertNotNull(savedCustomer);
        Assertions.assertNotNull(savedCustomer.getId());
    }
}
