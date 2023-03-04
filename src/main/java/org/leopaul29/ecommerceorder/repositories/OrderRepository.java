package org.leopaul29.ecommerceorder.repositories;

import org.leopaul29.ecommerceorder.entities.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
