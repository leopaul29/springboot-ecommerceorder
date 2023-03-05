package org.leopaul29.ecommerceorder.services.servicesimpl;

import org.leopaul29.ecommerceorder.entities.Item;
import org.leopaul29.ecommerceorder.repositories.ItemRepository;
import org.leopaul29.ecommerceorder.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemRepository repository;

    @Override
    public Item saveItem(Item item) {
        Optional<Item> savedItem = repository.findById(item.getId());
        if (savedItem.isPresent()) {
            System.err.println("Item already exist");
            //throw new ResourceNotFoundException("Customer already exist with given name:" + customer.getName());
        }
        return repository.save(item);
    }
}
