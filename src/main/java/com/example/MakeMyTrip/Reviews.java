package com.example.MakeMyTrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Reviews {
    @GetMapping("/myreviews")
    public String getData(){
        return"Please give your reviews here";
    }
}
