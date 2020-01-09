package org.example.entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;



@Getter
@Setter
@Entity(name="MenuItemEntity")
@Table(name="menu_item")
public class MenuItemEntity {
    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;

    @Column(name="price")
    private Double price;

    //private RestaurantEntity restaurantEntity;


}
