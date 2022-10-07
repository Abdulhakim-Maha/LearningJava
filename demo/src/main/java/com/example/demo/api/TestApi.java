package com.example.demo.api;


import com.example.demo.business.TestBusiness;
import com.example.demo.exception.BaseException;
import com.example.demo.model.MRegisterRequest;
import com.example.demo.model.TestResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/test")
public class TestApi {

    //METHOD : 2 => Constructor Injection
    private final TestBusiness business;

    public TestApi(TestBusiness business) {
        this.business = business;
    }

    @GetMapping
    public TestResponse test() {
        TestResponse response = new TestResponse();
        response.setName("austiniqer");
        response.setFood("Pizza");

        return response;
    }

    @PostMapping
    @RequestMapping("/register")
    public ResponseEntity<String> register(@RequestBody MRegisterRequest request) throws BaseException {

        String response = business.register(request);
        return ResponseEntity.ok(response);
    }

}
