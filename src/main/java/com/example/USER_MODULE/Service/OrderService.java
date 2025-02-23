package com.example.USER_MODULE.Service;




import com.example.USER_MODULE.Model.RestaurantOrder;
import com.example.USER_MODULE.Repository.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    // Place a new order
    public RestaurantOrder placeOrder(RestaurantOrder order) {
        return orderRepository.save(order);
    }

    // Get all orders for a user
    public List<RestaurantOrder> getOrderHistory(Long userId) {
        return orderRepository.findByUserId(userId);
    }

    // Track an order by ID
    public RestaurantOrder trackOrder(Long orderId) {
        return orderRepository.findById(orderId).orElse(null); // Optional check
    }

    // Get all orders for a restaurant
    public List<RestaurantOrder> getOrdersByRestaurant(Long restaurantId) {
        return orderRepository.findByRestaurantId(restaurantId);
    }

    // Get specific order details for a user
    public RestaurantOrder getOrderByUserAndOrderId(Long userId, Long orderId) {
        return orderRepository.findByIdAndUserId(orderId, userId);
    }
}
