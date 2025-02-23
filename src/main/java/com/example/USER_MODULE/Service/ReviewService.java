package com.example.USER_MODULE.Service;





import com.example.USER_MODULE.Model.Review;
import com.example.USER_MODULE.Repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    // Create a new review
    public Review createReview(Review review) {
        return reviewRepository.save(review);
    }

    // Get all reviews for a specific restaurant
    public List<Review> getReviewsForRestaurant(Long restaurantId) {
        return reviewRepository.findByRestaurantId(restaurantId);
    }

    // Get all reviews by a specific user
    public List<Review> getReviewsByUser(Long userId) {
        return reviewRepository.findByUserId(userId);
    }

    // Get average rating for a restaurant
    public double getAverageRatingForRestaurant(Long restaurantId) {
        List<Review> reviews = reviewRepository.findByRestaurantId(restaurantId);
        return reviews.stream().mapToInt(Review::getRating).average().orElse(0);
    }
}
