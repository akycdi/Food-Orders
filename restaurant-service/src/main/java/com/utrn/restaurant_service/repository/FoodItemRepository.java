package com.utrn.restaurant_service.repository;

import com.utrn.restaurant_service.model.FoodItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FoodItemRepository  extends MongoRepository<FoodItem, String> {
}
