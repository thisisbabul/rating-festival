package com.festival.userservice.controller;

import com.festival.userservice.entity.User;
import com.festival.userservice.reposity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping("/hello")
    public String hello() {
        return "Hello from user";
    }

    @PostMapping("/adduser")
    public String saveUser(@RequestBody User user) {
        try {
            repository.save(user);
            return "success";
        }
        catch (Exception e) {
            System.out.println("User added failed "+e.getMessage());
            return "failed";
        }
    }
}
