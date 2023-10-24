package com.TransTech.LalandSons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TransTech.LalandSons.entity.InventoryItem;

@Repository
public interface InventoryRepository extends JpaRepository<InventoryItem, Long>{

}
