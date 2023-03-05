package org.leopaul29.ecommerceorder.repositories;

import org.leopaul29.ecommerceorder.entities.Datawarehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatawarehouseRepository extends JpaRepository<Datawarehouse, Long> {
}
