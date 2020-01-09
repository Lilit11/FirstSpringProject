package org.example.repository;

import org.example.entity.MenuItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MenuItemRepository extends JpaRepository<MenuItemEntity, Long>{

}

