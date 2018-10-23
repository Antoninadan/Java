package com.example.springjpa.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerTest {


    @RequestMapping(value = "/test-rest", method = RequestMethod.GET)
//    // show static text
//    public String test() {
//        return "test";
//    }

    // show json
    public TestRest testJson() {
        TestRest test = new TestRest();
        test.setX("test json");
        return test;
    }

    class TestRest {
        private String x;

        public String getX() {
            return x;
        }

        public void setX(String x) {
            this.x = x;
        }
    }

}



