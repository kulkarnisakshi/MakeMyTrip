package com.example.MakeMyTrip;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Forex {
    @GetMapping("/myforex")
    public String getData(){
        return"Please check forex for International money transfer";
    }
}