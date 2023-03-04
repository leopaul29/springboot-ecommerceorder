package org.leopaul29.ecommerceorder.repositories;

import org.leopaul29.ecommerceorder.entities.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Long> {
}
