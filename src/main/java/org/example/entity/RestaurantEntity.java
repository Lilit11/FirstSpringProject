package org.example.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
public class RestaurantEntity {

    private Long id;
    private String name;
    private  String address;

    private Set<MenuItemEntity> menuItems = new HashSet<MenuItemEntity>();


}
