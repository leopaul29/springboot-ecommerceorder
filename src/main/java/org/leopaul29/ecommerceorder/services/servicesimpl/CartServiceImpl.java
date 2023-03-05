package org.leopaul29.ecommerceorder.services.servicesimpl;

import org.leopaul29.ecommerceorder.entities.Cart;
import org.leopaul29.ecommerceorder.repositories.CartRepository;
import org.leopaul29.ecommerceorder.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartRepository repository;

    @Override
    public Cart saveCart(Cart cart) {
        Optional<Cart> savedCart = repository.findById(cart.getId());
        if (savedCart.isPresent()) {
            System.err.println("Order already exist");
        }
        return repository.save(cart);
    }

    @Override
    public Cart getCartById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Cart> getAllCart() {
        return repository.findAll();
    }
}
