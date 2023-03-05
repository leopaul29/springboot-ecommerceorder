package org.leopaul29.ecommerceorder.services;

import org.leopaul29.ecommerceorder.entities.Cart;
import org.leopaul29.ecommerceorder.entities.Customer;

public interface CustomerCartService {
    Cart createCustomerCart(Customer customer);

}
