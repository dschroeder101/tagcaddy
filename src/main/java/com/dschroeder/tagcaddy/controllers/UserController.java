package com.dschroeder.tagcaddy.controllers;

import com.dschroeder.tagcaddy.model.User;
import com.dschroeder.tagcaddy.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api")
public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/{id}")
    User getUser(@PathVariable Long id) {
        return userService.findById(id);
    }

    @GetMapping("/users")
    Collection<User> getUsers() {
        return userService.findAll();
    }
}
