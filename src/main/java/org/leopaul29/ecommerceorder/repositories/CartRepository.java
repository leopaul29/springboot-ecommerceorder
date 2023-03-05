package org.leopaul29.ecommerceorder.repositories;

import org.leopaul29.ecommerceorder.entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
}
