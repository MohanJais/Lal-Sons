package com.TransTech.LalandSons.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TransTech.LalandSons.entity.Order;
import com.TransTech.LalandSons.repository.OrderRepository;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Order getOrderByid(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public void updateOrder(Long id, Order updatedOrder) {
        Order order = orderRepository.findById(id).orElse(null);
        if (order != null) {
            order.setCustomerId(updatedOrder.getCustomerId());
            order.setOrderDate(updatedOrder.getOrderDate());
            order.setOrderStatus(updatedOrder.getOrderStatus());
            orderRepository.save(order);
        }
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
