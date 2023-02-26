package com.example.MakeMyTrip;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Activities {
    @GetMapping("/myactivities")
    public String getData(){
      return"Please check recent activities happening in city";
    }
}

