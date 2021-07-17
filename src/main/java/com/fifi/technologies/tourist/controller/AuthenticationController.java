package com.fifi.technologies.tourist.controller;

import com.fifi.technologies.tourist.model.User;
import com.fifi.technologies.tourist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/auth")
public class AuthenticationController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/register")
    public User register(@Valid @RequestBody User user) {
        return userService.register(user);
    }
}
