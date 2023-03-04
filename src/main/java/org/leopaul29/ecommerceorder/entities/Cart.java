package org.leopaul29.ecommerceorder.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Customer customer;
    private List<Order> orderList;
    private CartStatus status;

    public Cart() {
        status = CartStatus.ORDER_TMP;
    }
}
