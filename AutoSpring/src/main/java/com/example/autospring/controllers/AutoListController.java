package com.example.autospring.controllers;

import com.example.autospring.repository.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AutoListController {
    @Autowired
    private AutoRepository autoRepository;

    @RequestMapping(value = "/auto-list", method = RequestMethod.GET)
    public String test(Model model) {
        model.addAttribute("allAuto", autoRepository.findAll());
        return "auto_list";
    }
}

