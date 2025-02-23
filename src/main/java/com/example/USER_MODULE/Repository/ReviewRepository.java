package com.example.USER_MODULE.Repository;





import com.example.USER_MODULE.Model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByRestaurantId(Long restaurantId); // Fetch reviews for a particular restaurant
    List<Review> findByUserId(Long userId); // Fetch reviews written by a specific user
}
