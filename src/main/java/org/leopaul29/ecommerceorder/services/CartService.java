package org.leopaul29.ecommerceorder.services;

import org.leopaul29.ecommerceorder.entities.Cart;

public interface CartService {
    Cart saveCart(Cart cart);

    Cart getCartById(Long id);

    Iterable<Cart> getAllCart();
}
