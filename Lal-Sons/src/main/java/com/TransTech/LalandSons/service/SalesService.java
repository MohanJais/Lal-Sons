package com.TransTech.LalandSons.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TransTech.LalandSons.entity.Sales;
import com.TransTech.LalandSons.repository.SalesRepository;

@Service
public class SalesService {
    @Autowired
    private SalesRepository salesRepository;
    
    public Sales getSalesByid(Long id) {
        return salesRepository.findById(id).orElse(null);
    }
    
    public List<Sales> getAllSales() {
        return salesRepository.findAll();
    }
    
    public Sales createSales(Sales sales) {
        return salesRepository.save(sales);
    }
    
    public void updateSales(Long id, Sales updatedSales) {
        Sales sales = salesRepository.findById(id).orElse(null);
        if (sales != null) {
            sales.setCustomerName(updatedSales.getCustomerName());
            sales.setSaleDate(updatedSales.getSaleDate());
            sales.setSaleAmount(updatedSales.getSaleAmount());
            salesRepository.save(sales);
        }
    }
    
    public void deleteSales(Long id) {
        salesRepository.deleteById(id);
    }
}
