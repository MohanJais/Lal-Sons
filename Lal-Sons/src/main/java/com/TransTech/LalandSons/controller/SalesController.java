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

import com.TransTech.LalandSons.entity.Sales;
import com.TransTech.LalandSons.service.SalesService;

@RestController
@RequestMapping("/sales")
public class SalesController {
    @Autowired
    private SalesService salesService;
    
    @GetMapping("/{id}")
    public Sales getSales(@PathVariable Long id) {
        return salesService.getSalesByid(id);
    }
    
    @GetMapping
    public List<Sales> getAllSales() {
        return salesService.getAllSales();
    }
    
    @PostMapping
    public Sales createSales(@RequestBody Sales sales) {
        return salesService.createSales(sales);
    }
    
    @PutMapping("/{id}")
    public void updateSales(@PathVariable Long id, @RequestBody Sales updatedSales) {
        salesService.updateSales(id, updatedSales);
    }
    
    @DeleteMapping("/{id}")
    public void deleteSales(@PathVariable Long id) {
        salesService.deleteSales(id);
    }
}
