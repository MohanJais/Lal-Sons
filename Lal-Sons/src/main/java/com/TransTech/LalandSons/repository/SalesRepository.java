package com.TransTech.LalandSons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TransTech.LalandSons.entity.Sales;

@Repository
public interface SalesRepository extends JpaRepository<Sales, Long>{

}
