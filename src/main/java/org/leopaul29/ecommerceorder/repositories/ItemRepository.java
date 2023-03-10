package org.leopaul29.ecommerceorder.repositories;

import org.leopaul29.ecommerceorder.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
