package com.example.autospring.controllers;

import com.example.autospring.entities.Manufactor;
import com.example.autospring.repository.AutoRepository;
import com.example.autospring.repository.ManufactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ManufactorController {

    private ManufactorRepository manufactorRepository;

    @Autowired
    public ManufactorController(ManufactorRepository manufactorRepository) {
        this.manufactorRepository = manufactorRepository;
    }

    @ModelAttribute("allManufactor")
    public List<Manufactor> allUsers() {
//        Manufactor manufactor1 = new Manufactor("Toyota");
//        Manufactor manufactor2 = new Manufactor("Mercedes");

        List<Manufactor> manufactorList= manufactorRepository.findAll();
        System.out.println(manufactorList);
        return manufactorList;
    }

}
