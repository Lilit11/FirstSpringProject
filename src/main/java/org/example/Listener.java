package org.example;

import org.example.entity.AddressEntity;
import org.example.entity.CustomerEntity;
import org.example.entity.MenuItemEntity;
import org.example.entity.OrderItemEntity;
import org.example.repository.AddressRepository;
import org.example.repository.CustomerRepository;
import org.example.repository.MenuItemRepository;
import org.example.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


/*
https://vladmihalcea.com/tutorials/hibernate/
Relationships


Persistence Context

**/


@Component
public class Listener {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Autowired
    private MenuItemRepository menuItemRepository;

    @EventListener({ContextRefreshedEvent.class})
    public void onContextRefreshedEvent() {
        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setApartment("Liliti appartment");
        addressEntity.setBuilding("23");
        addressEntity.setDetails("shat sirun devichi appartment");
        addressEntity.setStreet("Mamikon");

        addressRepository.save(addressEntity);

        System.out.println();


            CustomerEntity customerEntity = new CustomerEntity();
            customerEntity.setFirstName("Lilit");
            customerEntity.setLastName("Hakobyan");


            customerRepository.save(customerEntity);

            System.out.println();

            MenuItemEntity menuItemEntity = new MenuItemEntity();
            menuItemEntity.setDescription("shat hamov item");
            menuItemEntity.setName("pamidorov dzvadzex");
            menuItemEntity.setPrice(20.5);

        menuItemEntity = menuItemRepository.save(menuItemEntity);

        OrderItemEntity orderItemEntity = new OrderItemEntity();
        orderItemEntity.setPrice(15.5);
        orderItemEntity.setQuantity(2L);
        orderItemEntity.setMenuItemEntity(menuItemEntity);

        orderItemRepository.save(orderItemEntity);

        }
    }

