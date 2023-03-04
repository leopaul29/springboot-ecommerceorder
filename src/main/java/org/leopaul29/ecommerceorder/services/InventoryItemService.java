package org.leopaul29.ecommerceorder.services;

import org.leopaul29.ecommerceorder.repositories.InventoryItemRepository;
import org.springframework.data.repository.CrudRepository;

public interface InventoryItemService extends CrudRepository<InventoryItemRepository, Long> {
}
