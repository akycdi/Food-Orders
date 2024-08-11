package com.utrn.restaurant_service.controller;

import com.utrn.restaurant_service.model.FoodItem;
import com.utrn.restaurant_service.model.Restaurant;
import com.utrn.restaurant_service.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @PostMapping()
    public ResponseEntity<Restaurant> createRestaurant(@RequestBody Restaurant restaurant) {
        Restaurant savedRestaurant = restaurantService.saveRestaurant(restaurant);
        return ResponseEntity.ok(savedRestaurant);
    }

    @PostMapping("/add-items")
    public ResponseEntity<?> addFoodItems(@RequestBody List<FoodItem> newFoodItems, @RequestParam(name = "rsId") String restaurantId) {
        HashMap<String, String> response = restaurantService.saveFoodItem(newFoodItems, restaurantId);
        return ResponseEntity.ok(response);
    }
}