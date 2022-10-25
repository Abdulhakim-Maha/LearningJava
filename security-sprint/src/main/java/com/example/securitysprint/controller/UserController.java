package com.example.securitysprint.controller;


import com.example.securitysprint.model.User;
import com.example.securitysprint.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired @Qualifier("userServiceImpl")
    UserService userService;

    @PostMapping("/login")
    public ResponseEntity<User> getHello(@RequestBody User user){
//        return ResponseEntity.ok().body(reqData);
        System.out.println(user);
        return ResponseEntity.ok().body(userService.saveUser(user));
    }

    @GetMapping("/protected")
    public String takeSecret(){
        return "you got this";
    }
}
