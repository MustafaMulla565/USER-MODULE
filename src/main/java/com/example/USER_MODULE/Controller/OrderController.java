package com.example.USER_MODULE.Controller;


import com.example.USER_MODULE.Model.RestaurantOrder;
import com.example.USER_MODULE.Service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    // Place a new order
    @PostMapping("/create")
    public RestaurantOrder placeOrder(@RequestBody RestaurantOrder order) {
        return orderService.placeOrder(order);
    }

    // Get order history for a user
    @GetMapping("/history/{userId}")
    public List<RestaurantOrder> getOrderHistory(@PathVariable Long userId) {
        return orderService.getOrderHistory(userId);
    }

    // Track an order by order ID
    @GetMapping("/{orderId}")
    public RestaurantOrder trackOrder(@PathVariable Long orderId) {
        return orderService.trackOrder(orderId);
    }

    // Get orders for a specific restaurant
    @GetMapping("/restaurant/{restaurantId}")
    public List<RestaurantOrder> getOrdersByRestaurant(@PathVariable Long restaurantId) {
        return orderService.getOrdersByRestaurant(restaurantId);
    }

    // Get a specific order for a user
    @GetMapping("/user/{userId}/order/{orderId}")
    public RestaurantOrder getOrderByUserAndOrderId(@PathVariable Long userId, @PathVariable Long orderId) {
        return orderService.getOrderByUserAndOrderId(userId, orderId);
    }

}
