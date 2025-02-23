package com.example.USER_MODULE.Service;





import com.example.USER_MODULE.Model.Restaurant;
import com.example.USER_MODULE.Repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    // Create or update a restaurant
    public Restaurant createOrUpdateRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    // Get all restaurants
    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    // Get restaurant by ID
    public Restaurant getRestaurantById(Long id) {
        return restaurantRepository.findById(id).orElse(null); // Optional check
    }

    // Search restaurants by cuisine
    public List<Restaurant> getRestaurantsByCuisine(String cuisine) {
        return restaurantRepository.findByCuisine(cuisine);
    }

    // Search restaurants by location
    public List<Restaurant> getRestaurantsByLocation(String location) {
        return restaurantRepository.findByLocationContaining(location);
    }
}
