package com.example.autospring.controllers;

import com.example.autospring.entities.Auto;
import com.example.autospring.repository.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class AutoController {
    private AutoRepository autoRepository;

//    @ModelAttribute("allAuto")
//    public List<Auto> populateAutos() {
//        return this.autoRepository.findAll();
//    }

    @Autowired
    public AutoController(AutoRepository autoRepository) {
        this.autoRepository = autoRepository;
    }

    @RequestMapping(value = "/auto-create", method = RequestMethod.GET)
    public ModelAndView showAutoCreate(ModelAndView modelAndView) {
        modelAndView.setViewName("auto_create");
        return modelAndView;
    }

    @RequestMapping(value = "/auto-create", method = RequestMethod.POST)
    public boolean create(HttpServletRequest request) {

        String autoName = request.getParameter("autoName");
        Integer autoEngineSize = Integer.parseInt(request.getParameter("autoEngineSize"));

        Auto auto = new Auto();

        auto.setMark(autoName);
        auto.setEngineSize(autoEngineSize);

        return autoRepository.save(auto) != null;
    }

//    @RequestMapping(value = "/auto-list", method = RequestMethod.GET)
//    public ModelAndView showAutoList(ModelAndView modelAndView) {
//        modelAndView.setViewName("auto_list");
//        List<Auto> allAuto = autoRepository.findAll();
//        modelAndView.addObject("allAuto", allAuto);
//        return modelAndView;
//    }

//    public List<Auto> findAll() {
//
//        return autoRepository.findAll();
//    }

}
