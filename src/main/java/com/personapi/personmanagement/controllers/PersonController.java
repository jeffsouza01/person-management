package com.personapi.personmanagement.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    @GetMapping("test")
    public String getHello() {
        return "Hello Dev on API!!!";
    }
}
