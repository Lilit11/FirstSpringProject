package org.example.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity(name = "OrderEntity")
@Table(name = "my_order")
public class OrderEntity {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "anun")
    private String anun;

//    @Column(name="customerEntity")
//    private CustomerEntity customerEntity;
//    @Column(name="addressEntity")
//    private AddressEntity addressEntity;
//    @Column(name="restaurantEntity")
//    private RestaurantEntity restaurantEntity;
//
//
//
//    private Set<OrderItemEntity> orderItems = new HashSet<OrderItemEntity>();
    //orderType
    //time chgitem vonc anem((
}


