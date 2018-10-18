package com.example.springtest.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/test") //(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "test";
    }

}
