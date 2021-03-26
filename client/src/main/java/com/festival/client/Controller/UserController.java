package com.festival.client.Controller;

import com.festival.client.model.Rating;
import com.festival.client.model.User;
import com.festival.client.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin("*")
public class UserController {
    private final UserService userService;

    UserController(UserService orderService) {
        this.userService = orderService;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/adduser")
    public String addUser(@RequestBody User user) {
        return userService.addUser(user);
    }
}
