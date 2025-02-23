package com.example.USER_MODULE.Repository;






import com.example.USER_MODULE.Model.RestaurantOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<RestaurantOrder, Long> {
    List<RestaurantOrder> findByUserId(Long userId); // Fetch orders for a particular user
    List<RestaurantOrder> findByRestaurantId(Long restaurantId); // Fetch orders for a particular restaurant
    RestaurantOrder findByIdAndUserId(Long orderId, Long userId); // Fetch a specific order for a user by orderId
}
