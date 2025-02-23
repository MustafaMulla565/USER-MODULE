package com.example.USER_MODULE.Controller;




import com.example.USER_MODULE.Model.Review;
import com.example.USER_MODULE.Service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    // Create a new review
    @PostMapping
    public Review createReview(@RequestBody Review review) {
        return reviewService.createReview(review);
    }

    // Get reviews for a restaurant
    @GetMapping("/restaurant/{restaurantId}")
    public List<Review> getReviewsForRestaurant(@PathVariable Long restaurantId) {
        return reviewService.getReviewsForRestaurant(restaurantId);
    }

    // Get reviews by a user
    @GetMapping("/user/{userId}")
    public List<Review> getReviewsByUser(@PathVariable Long userId) {
        return reviewService.getReviewsByUser(userId);
    }

    // Get average rating for a restaurant
    @GetMapping("/restaurant/{restaurantId}/average")
    public double getAverageRatingForRestaurant(@PathVariable Long restaurantId) {
        return reviewService.getAverageRatingForRestaurant(restaurantId);
    }
}

