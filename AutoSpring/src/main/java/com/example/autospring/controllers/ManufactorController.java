package com.example.autospring.controllers;

import com.example.autospring.entities.Manufactor;
import com.example.autospring.repository.AutoRepository;
import com.example.autospring.repository.ManufactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class ManufactorController {

    private ManufactorRepository manufactorRepository;

    @Autowired
    public ManufactorController(ManufactorRepository manufactorRepository) {
        this.manufactorRepository = manufactorRepository;
    }

    @RequestMapping(value = "/manufactor-list", method = RequestMethod.GET)
    public ModelAndView showAllAuto(ModelAndView modelAndView) {
        modelAndView.setViewName("manufactor_list");
        modelAndView.addObject("allManufactor", manufactorRepository.findAll());
        return modelAndView;
    }


    @RequestMapping(value = "/manufactor-create", method = RequestMethod.POST)
    public boolean create(HttpServletRequest request) {

        Manufactor manufactor = new Manufactor("BMW");

        return manufactorRepository.save(manufactor) != null;
    }

}
