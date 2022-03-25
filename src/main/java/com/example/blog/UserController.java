package com.example.blog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// register this class w/ a framework to handle HTTP request
@RequestMapping("users")
// make the methods available when a request is sent to /users 
public class UserController {
    @GetMapping("/status/check")
    // register this method and will trigger this method when HTTP Get request is sent to a /users/status/check URL path
    public String status() {
        return "working";
    }
}