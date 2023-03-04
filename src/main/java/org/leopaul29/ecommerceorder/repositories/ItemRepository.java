package org.leopaul29.ecommerceorder.repositories;

import org.leopaul29.ecommerceorder.entities.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
}
