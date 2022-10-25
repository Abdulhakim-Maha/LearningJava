package com.ckinan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/protected-resource")
    public String protectedResource(){
        return "The Protected Resource";
    }

    @GetMapping("/public-resource")
    public String publicResource(){
        return "The Public Resource";
    }
}
