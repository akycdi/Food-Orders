package com.utrn.restaurant_service.service;

import com.utrn.restaurant_service.model.FoodItem;
import com.utrn.restaurant_service.model.Restaurant;

import java.util.HashMap;
import java.util.List;

public interface RestaurantService {

    public Restaurant saveRestaurant(Restaurant restaurant);

    HashMap<String, String> saveFoodItem(List<FoodItem> newFoodItems, String restaurantId);
}
