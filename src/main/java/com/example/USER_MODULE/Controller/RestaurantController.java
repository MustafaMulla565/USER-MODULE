package com.example.USER_MODULE.Controller;



import com.example.USER_MODULE.Model.Restaurant;
import com.example.USER_MODULE.Service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    // Create or update a restaurant
    @PostMapping
    public Restaurant createOrUpdateRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantService.createOrUpdateRestaurant(restaurant);
    }

    // Get all restaurants
    @GetMapping
    public List<Restaurant> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }

    // Get a restaurant by ID
    @GetMapping("/{id}")
    public Restaurant getRestaurantById(@PathVariable Long id) {
        return restaurantService.getRestaurantById(id);
    }

    // Search restaurants by cuisine
    @GetMapping("/search/cuisine")
    public List<Restaurant> getRestaurantsByCuisine(@RequestParam String cuisine) {
        return restaurantService.getRestaurantsByCuisine(cuisine);
    }

    // Search restaurants by location
    @GetMapping("/search/location")
    public List<Restaurant> getRestaurantsByLocation(@RequestParam String location) {
        return restaurantService.getRestaurantsByLocation(location);
    }
}

