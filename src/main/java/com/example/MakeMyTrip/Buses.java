package com.example.MakeMyTrip;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Buses {
    @GetMapping("/mybuses")
    public String getData(){
        return"Please check available bus services";
    }
}