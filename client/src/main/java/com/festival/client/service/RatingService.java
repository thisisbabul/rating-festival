package com.festival.client.service;

import com.festival.client.model.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("rating-service")
public interface RatingService {

    @RequestMapping(method = RequestMethod.POST, value = "/addrating")
    String addRating(@RequestBody Rating rating);

    @RequestMapping(method = RequestMethod.GET, value = "/getallrating")
    List<Rating> getAllRating();
}
