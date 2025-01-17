package com.example.securitydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String home(){
        return "hello world";
    }

    @GetMapping("/user")
    public String user(){
        return "hello, user";
    }

    @GetMapping("/admin")
    public String admin(){
        return "hello, admin";
    }

}
