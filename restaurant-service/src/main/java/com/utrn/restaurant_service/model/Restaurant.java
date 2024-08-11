package com.utrn.restaurant_service.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.ArrayList;
import java.util.List;

@Data
@Document(collection = "restaurants")
public class Restaurant {

    @Id
    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private String location;
    private String openingTime;
    private String closingTime;
    private String closedDates;
    private Double ratings;

    @DBRef
    private List<FoodItem> foodItems = new ArrayList<>();
}