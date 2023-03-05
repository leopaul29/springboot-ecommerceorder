package org.leopaul29.ecommerceorder.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
@Table(name = "cart")
public class Cart implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Customer customer;
    //    @OneToMany(mappedBy = "cart", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @OrderBy("quantity ASC")
    private List<Order> orderList;
    private CartStatus status;

    public Cart() {
        status = CartStatus.ORDER_TMP;
    }
}
