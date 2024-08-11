package com.utrn.restaurant_service.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RequestMapping("/greeting")
@RestController
public class Greeting {

    @GetMapping("/")
    public String fetchSchools(){
        return ("From restaurnt service");
    }
}
