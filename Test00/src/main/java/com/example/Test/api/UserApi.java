package com.example.Test.api;

import com.example.Test.models.User;
import com.example.Test.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserApi {

    private final UserRepository userRepository;

    public UserApi(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/getUsers")
    public List<User> getAllUser(){
       return userRepository.findAll();
    }

    @PostMapping("/postUser")
    public String postUser(@RequestBody User user){
        userRepository.save(user);
        return  "{ users :" + userRepository.findAll() + "}";
    }
}


