package org.leopaul29.ecommerceorder.entities;

import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
@Table(name = "datawarehouse")
public class Datawarehouse implements Serializable {
    private Item item;
    private Integer total_quantity;
}
