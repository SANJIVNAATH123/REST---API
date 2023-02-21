package com.example.springapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/")
    public String getMyFav() {
        String yourFavColor = "Blue";
        return "My favorite color is " + yourFavColor;
    }
}