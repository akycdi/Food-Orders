package com.utrn.restaurant_service.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Data
@Document(collection = "food_items")
public class FoodItem {

    @Id
    private String id;

    private String name;
    private Double price;
    private String image;  // You may store images as Base64 or store paths to the images.
    private String description;
    private Double ratings;
    private boolean isVeg;
    private String category;
    private boolean isAvailable;
    private Integer quantity;

    @DBRef
    private Restaurant restaurant;

    // Getters and Setters
    // Constructors
}