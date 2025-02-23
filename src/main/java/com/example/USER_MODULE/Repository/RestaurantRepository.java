package com.example.USER_MODULE.Repository;




import com.example.USER_MODULE.Model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    List<Restaurant> findByCuisine(String cuisine); // Fetch restaurants by cuisine type
    List<Restaurant> findByLocationContaining(String location); // Fetch restaurants by location
}
