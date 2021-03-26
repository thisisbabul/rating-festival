package com.festival.ratingservice.controller;

import com.festival.ratingservice.entity.Rating;
import com.festival.ratingservice.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RatingController {

    @Autowired
    private RatingRepository ratingRepository;

    @PostMapping("/addrating")
    public String saveRating(@RequestBody Rating rating) {
        try {
            ratingRepository.save(rating);
            return "You have rated successfully!!! Thanks";
        }
        catch (Exception e) {
            System.out.println("Rating Added Failed "+e.getMessage());
            return "failed";
        }
    }

    @GetMapping("/getallrating")
    public List<Rating> saveRating() {
        try {
            return ratingRepository.findAll();
        }
        catch (Exception e) {
            System.out.println("Failed "+e.getMessage());
            return null;
        }
    }
}
