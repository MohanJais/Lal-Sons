package com.TransTech.LalandSons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TransTech.LalandSons.entity.Warehouse;

@Repository
public interface WarehouseRepository extends JpaRepository<Warehouse, Long>{

}
