package com.example.autospring.controllers;

import com.example.autospring.entities.Auto;
import com.example.autospring.entities.Manufactor;
import com.example.autospring.repository.AutoRepository;
import com.example.autospring.repository.ManufactorRepository;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class AutoController {

    private AutoRepository autoRepository;
    private ManufactorRepository manufactorRepository;

    @Autowired
    public AutoController(AutoRepository autoRepository, ManufactorRepository manufactorRepository) {

        this.autoRepository = autoRepository;
        this.manufactorRepository = manufactorRepository;
    }

    @RequestMapping(value = "/auto-create", method = RequestMethod.GET)
    public ModelAndView showAutoCreate(ModelAndView modelAndView) {
        modelAndView.addObject("allManufactor", manufactorRepository.findAll());
        modelAndView.setViewName("auto_create");
        return modelAndView;
    }


    @RequestMapping(value = "/auto-create", method = RequestMethod.POST)
    public ModelAndView create(ModelAndView modelAndView, HttpServletRequest request, HttpResponse response) {

        String autoName = request.getParameter("autoName");
        Integer autoEngineSize = Integer.parseInt(request.getParameter("autoEngineSize"));
        String autoManufactorName = request.getParameter("manufacturerName");

        List<Manufactor> autoManufactorList = manufactorRepository.findByName(autoManufactorName);
        Manufactor autoManufactor = autoManufactorList.get(autoManufactorList.size()-1);

        Auto auto = new Auto(autoName, autoEngineSize, autoManufactor);
        autoRepository.save(auto);

        return   showAllAuto(modelAndView);
    }


    // witout paginator
    @RequestMapping(value = "/auto-list", method = RequestMethod.GET)
    public ModelAndView showAllAuto(ModelAndView modelAndView) {
        modelAndView.setViewName("auto_list");
        modelAndView.addObject("allAuto", autoRepository.findAll());

        return modelAndView;
    }



//    // paginator
//    @RequestMapping(value = "/auto-list", method = RequestMethod.GET)
//    public Page<Auto> findAll(ModelAndView modelAndView) {
//        modelAndView.addObject("allAuto", autoRepository.findAll());
//        return autoRepository.findAll(PageRequest.of(0, 4));
//    }
}
