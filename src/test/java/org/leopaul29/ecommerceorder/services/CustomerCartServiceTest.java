package org.leopaul29.ecommerceorder.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leopaul29.ecommerceorder.entities.*;
import org.leopaul29.ecommerceorder.repositories.*;
import org.leopaul29.ecommerceorder.services.servicesimpl.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest(classes = CustomerCartService.class)
class CustomerCartServiceTest {

    @Mock
    private CustomerRepository customerRepository;
    @InjectMocks
    private CustomerServiceImpl customerService;
    private Customer customer;
    @Mock
    private ItemRepository itemRepository;
    @InjectMocks
    private ItemServiceImpl itemService;
    private Item firstItem;
    private Item secondItem;
    @Mock
    private DatawarehouseRepository datawarehouseRepository;
    @InjectMocks
    private DatawarehouseServiceImpl datawarehouseService;
    @Mock
    private OrderRepository orderRepository;
    @InjectMocks
    private OrderServiceImpl orderService;
    @Mock
    private CartRepository cartRepository;
    @InjectMocks
    private CartServiceImpl cartService;

    @BeforeEach
    public void setUp() {
        // customer
        customer = Customer.builder().name("alex").build();
        customerService.saveCustomer(customer);
        // items
        firstItem = Item.builder().name("item 1").price(2.20).build();
        itemService.saveItem(firstItem);
        secondItem = Item.builder().name("item 2").price(20.0).build();
        itemService.saveItem(secondItem);
        // data warehouse
        Datawarehouse firstDatawarehouse = Datawarehouse.builder().item(firstItem).total_quantity(10).build();
        datawarehouseService.saveDatawarehouse(firstDatawarehouse);
        Datawarehouse secondDatawarehouse = Datawarehouse.builder().item(secondItem).total_quantity(1).build();
        datawarehouseService.saveDatawarehouse(secondDatawarehouse);
    }

    @Test
    void givenCustomerCartObject_whenAddOrderItemToCustomerCart_thenReturnCustomerCartObject() {
        // create orders and cart for customer
        Order firstOrder = Order.builder().item(firstItem).Quantity(2).build();
        orderService.saveOrder(firstOrder);
        Cart cart = Cart.builder().customer(customer).orderList(Arrays.asList(firstOrder)).status(CartStatus.ORDER_TMP).build();
        cartService.saveCart(cart);
        System.out.println(cartService.getAllCart());
    }
}
