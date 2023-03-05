package org.leopaul29.ecommerceorder.services.servicesimpl;

import org.leopaul29.ecommerceorder.entities.Order;
import org.leopaul29.ecommerceorder.repositories.OrderRepository;
import org.leopaul29.ecommerceorder.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository repository;

    @Override
    public Order saveOrder(Order order) {
        Optional<Order> savedOrder = repository.findById(order.getId());
        if (savedOrder.isPresent()) {
            System.err.println("Order already exist");
        }
        return repository.save(order);
    }
}
