package com.TransTech.LalandSons.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TransTech.LalandSons.entity.Product;
import com.TransTech.LalandSons.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product getProductByid(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public void updateProduct(Long id, Product updatedProduct) {
        Product product = productRepository.findById(id).orElse(null);
        if (product != null) {
            product.setProductName(updatedProduct.getProductName());
            product.setDescription(updatedProduct.getDescription());
            product.setPrice(updatedProduct.getPrice());
            productRepository.save(product);
        }
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
