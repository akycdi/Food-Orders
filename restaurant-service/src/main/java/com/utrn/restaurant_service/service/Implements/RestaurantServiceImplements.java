package com.utrn.restaurant_service.service.Implements;


import com.utrn.restaurant_service.model.FoodItem;
import com.utrn.restaurant_service.model.Restaurant;
import com.utrn.restaurant_service.repository.FoodItemRepository;
import com.utrn.restaurant_service.repository.RestaurantRepository;
import com.utrn.restaurant_service.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class RestaurantServiceImplements implements RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Autowired
    private FoodItemRepository foodItemRepository;

    public Restaurant saveRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    @Override
    public HashMap<String, String> saveFoodItem(List<FoodItem> newFoodItems, String restaurantId) {
        Restaurant restaurant = restaurantRepository.findById(restaurantId).orElseThrow(() -> new RuntimeException("Restaurant not found"));

        // Update the restaurant with new food items
        for (FoodItem foodItem : newFoodItems) {
            foodItem.setRestaurant(restaurant);
            foodItemRepository.save(foodItem);
        }

        // Add the new food items to the restaurant's list
        restaurant.getFoodItems().addAll(newFoodItems);
        restaurantRepository.save(restaurant);

        HashMap<String, String> response = new HashMap<>();
        response.put("message", "Items added successfully to restaurant - " + restaurantId);
        return response;
    }
}
