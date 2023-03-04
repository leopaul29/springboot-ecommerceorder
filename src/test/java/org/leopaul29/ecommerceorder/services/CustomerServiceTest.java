package org.leopaul29.ecommerceorder.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.leopaul29.ecommerceorder.entities.Customer;
import org.leopaul29.ecommerceorder.repositories.CustomerRepository;
import org.leopaul29.ecommerceorder.services.servicesimpl.CustomerServiceImpl;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = CustomerService.class)
class CustomerServiceTest {

    @Mock
    private CustomerRepository customerRepository;
    @InjectMocks
    private CustomerServiceImpl customerService;
    private Customer customer;

    @BeforeEach
    public void setUp() {
        customer = Customer.builder().name("alex").build();
    }

    @DisplayName("test for saveCustomer method")
    @Test
    public void givenCustomerObject_whenSaveCustomer_thenReturnCustomerObject() {
        BDDMockito.given(customerRepository.findByName(customer.getName())).willReturn(Optional.empty());

        BDDMockito.given(customerRepository.save(customer)).willReturn(customer);

        Customer savedCustomer = customerService.saveCustomer(customer);
        assertNotNull(savedCustomer);
    }

}
