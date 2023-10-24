package com.TransTech.LalandSons.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TransTech.LalandSons.entity.Warehouse;
import com.TransTech.LalandSons.repository.WarehouseRepository;

@Service
public class WarehouseService {

    @Autowired
    private WarehouseRepository warehouseRepository;

    public Warehouse getWarehouseById(Long id) {
        return warehouseRepository.findById(id).orElse(null);
    }

    public List<Warehouse> getAllWarehouses() {
        return warehouseRepository.findAll();
    }

    public Warehouse createWarehouse(Warehouse warehouse) {
        return warehouseRepository.save(warehouse);
    }

    public void updateWarehouse(Long id, Warehouse updatedWarehouse) {
        Warehouse warehouse = warehouseRepository.findById(id).orElse(null);
        if (warehouse != null) {
            // Update warehouse attributes based on your requirements
            warehouse.setLocation(updatedWarehouse.getLocation());
            warehouse.setCapacity(updatedWarehouse.getCapacity());
            // You can add more attributes to update as needed
            warehouseRepository.save(warehouse);
        }
    }

    public void deleteWarehouse(Long id) {
        warehouseRepository.deleteById(id);
    }
}
