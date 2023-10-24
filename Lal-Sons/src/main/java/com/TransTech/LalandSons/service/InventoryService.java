package com.TransTech.LalandSons.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TransTech.LalandSons.entity.InventoryItem;
import com.TransTech.LalandSons.repository.InventoryRepository;
import com.TransTech.LalandSons.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public InventoryItem getInventoryItemByid(Long id) {
        return inventoryRepository.findById(id).orElse(null);
    }

    public List<InventoryItem> getAllInventoryItems() {
        return inventoryRepository.findAll();
    }

    public InventoryItem createInventoryItem(InventoryItem inventoryItem) {
        return inventoryRepository.save(inventoryItem);
    }

    public void updateInventoryItem(Long id, InventoryItem updatedInventoryItem) {
//       InventoryItem inventoryItem = inventoryRepository.findById(id).orElse(null);
//        if (inventoryItem != null) {
//            inventoryItem.setProductName(updatedInventoryItem.getProductName());
//            inventoryItem.setQuantity(updatedInventoryItem.getQuantity());
//            inventoryItem.setLocation(updatedInventoryItem.getLocation());
//            // You can add more attributes to update as needed
//            inventoryRepository.save(inventoryItem);
//        }
    }

    public void deleteInventoryItem(Long id) {
        inventoryRepository.deleteById(id);
    }
}
