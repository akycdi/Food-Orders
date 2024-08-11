package com.utrn.restaurant_service.repository;

import com.utrn.restaurant_service.model.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RestaurantRepository extends MongoRepository<Restaurant , String> {
}
