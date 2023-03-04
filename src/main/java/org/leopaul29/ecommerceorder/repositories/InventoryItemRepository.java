package org.leopaul29.ecommerceorder.repositories;

import org.leopaul29.ecommerceorder.entities.ItemDatawarehouse;
import org.springframework.data.repository.CrudRepository;

public interface InventoryItemRepository extends CrudRepository<ItemDatawarehouse, Long> {
}
