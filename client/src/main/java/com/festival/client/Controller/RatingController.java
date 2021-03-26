package com.festival.client.Controller;

import com.festival.client.model.Rating;
import com.festival.client.model.User;
import com.festival.client.service.RatingService;
import com.festival.client.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class RatingController {
    private final RatingService ratingService;

    RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addrating")
    public String addUser(@RequestBody Rating rating) {
        return ratingService.addRating(rating);
    }


    @RequestMapping(method = RequestMethod.GET, value = "/getallrating")
    public List<Rating> getAllRating() {
        return ratingService.getAllRating();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getavgratingone")
    public int getAvgRatingOne() {
        return getAvgRating(1);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getavgratingtwo")
    public int getAvgRatingTwo() {
        return getAvgRating(2);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getavgratingthree")
    public int getAvgRatingThree() {
        return getAvgRating(3);
    }

    private int getAvgRating(int festival) {
        int sum = 0;
        int counter = 0;
        for (Rating rating : ratingService.getAllRating()) {
            if (rating.getFestival() == festival) {
                sum += rating.getRating();
                counter++;
            }
        }
        return sum / counter;
    }
}
