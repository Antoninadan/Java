package com.example.springjpa.controllers;

import com.example.springjpa.entities.Dog;
import com.example.springjpa.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DogController {

    private DogRepository dogRepository;

    @Autowired
    public DogController(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    @RequestMapping(value = "/dog", method = RequestMethod.GET)
    public List<Dog> findAll() {
        return dogRepository.findAll();
    }

    @RequestMapping(value = "/dog", method = RequestMethod.POST)
    public boolean create() {

        Dog dog = new Dog();
        dog.setName("Tuzik");
        dog.setAge(4);

        return dogRepository.save(dog) != null;
    }

}
