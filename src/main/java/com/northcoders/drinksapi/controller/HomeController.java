package com.northcoders.drinksapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "Welcome to the Drinks API!";
    }

    @GetMapping("/coffeelover")
    public String coffeelover(){
        return "I like coffee!";
    }

    @GetMapping("/coffee")
    public String coffee(){
        return new Coffee(1234, "Latte" ).toString();
    }
}
