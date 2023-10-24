package com.TransTech.LalandSons.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TransTech.LalandSons.entity.InventoryItem;
import com.TransTech.LalandSons.service.InventoryService;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @GetMapping("/{id}")
    public InventoryItem getInventoryItem(@PathVariable Long id) {
        return inventoryService.getInventoryItemByid(id);
    }

    @GetMapping
    public List<InventoryItem> getAllInventoryItems() {
        return inventoryService.getAllInventoryItems();
    }

    @PostMapping
    public InventoryItem createInventoryItem(@RequestBody InventoryItem inventoryItem) {
        return inventoryService.createInventoryItem(inventoryItem);
    }

    @PutMapping("/{id}")
    public void updateInventoryItem(@PathVariable Long id, @RequestBody InventoryItem updatedInventoryItem) {
        inventoryService.updateInventoryItem(id, updatedInventoryItem);
    }

    @DeleteMapping("/{id}")
    public void deleteInventoryItem(@PathVariable Long id) {
        inventoryService.deleteInventoryItem(id);
    }
}
