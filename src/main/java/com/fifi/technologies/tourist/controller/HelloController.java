package com.fifi.technologies.tourist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello-world")
public class HelloController {

    @GetMapping
    public String helloWorld() {
        return "Hello from endpoint with no authentication!";
    }
}
