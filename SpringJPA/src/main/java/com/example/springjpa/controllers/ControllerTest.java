package com.example.springjpa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ControllerTest {

    @RequestMapping(value = "/test-view", method = RequestMethod.GET)
    // 3 methods how to show view (resource/templates/testview.html). Need import dependency (spring-boot-starter-thymeleaf)
//    // first method - use HttpServletRequest/HttpServletResponse
//    public String methodOne(HttpServletRequest request, HttpServletResponse response) {
//        request.setAttribute("name", "test method one");
//        return "testview"; // name of view (resource/templates/testview.html) without extension
//    }

//    // second method - use Model
//    public String methodTwo(Model model) {
//        model.addAttribute("name", "test method two");
//        return "testview"; // name of view (resource/templates/testview.html) without extension
//    }

    // third method - use ModelAndView, the best method
    public ModelAndView methodThree(ModelAndView modelAndView) {
        modelAndView.setViewName("testview"); // name of view (resource/templates/testview.html) without extension
        modelAndView.addObject("name", "test method three");
        return modelAndView;
    }

}
