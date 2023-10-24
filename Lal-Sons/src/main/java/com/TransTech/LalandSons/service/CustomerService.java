package com.TransTech.LalandSons.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TransTech.LalandSons.entity.Customer;
import com.TransTech.LalandSons.repository.CustomerRepository;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    
    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }
    
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
    
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
    
    public void updateCustomer(Long id, Customer updatedCustomer) {
        Customer customer = customerRepository.findById(id).orElse(null);
        if (customer != null) {
            customer.setName(updatedCustomer.getName());
            customer.setEmail(updatedCustomer.getEmail());
            customer.setPhone(updatedCustomer.getPhone());
            customerRepository.save(customer);
        }
    }
    
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}
