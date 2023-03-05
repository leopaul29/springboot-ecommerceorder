package org.leopaul29.ecommerceorder.services.servicesimpl;

import org.leopaul29.ecommerceorder.entities.Datawarehouse;
import org.leopaul29.ecommerceorder.repositories.DatawarehouseRepository;
import org.leopaul29.ecommerceorder.services.DatawarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatawarehouseServiceImpl implements DatawarehouseService {
    @Autowired
    private DatawarehouseRepository repository;

    @Override
    public Datawarehouse saveDatawarehouse(Datawarehouse datawarehouse) {
        return null;
    }
}
