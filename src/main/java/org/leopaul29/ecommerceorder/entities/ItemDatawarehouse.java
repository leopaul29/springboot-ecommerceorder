package org.leopaul29.ecommerceorder.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class ItemDatawarehouse {
    private Item item;
    private Integer total_quantity;
}
