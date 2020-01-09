package org.example.entity;
import lombok.Cleanup;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity(name = "OrderItemEntity")
@Table(name = "order_item")
public class OrderItemEntity {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @OneToOne
    private MenuItemEntity menuItemEntity;

    //@Column(name="orderEntity")
//    private OrderEntity orderEntity;

    @Column(name = "quantity")
    private Long quantity;

    @Column(name = "price")
    private Double price;

}
