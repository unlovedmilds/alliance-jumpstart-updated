package com.alliance.jumpstart.controllers;

import com.alliance.jumpstart.entities.Career;
import com.alliance.jumpstart.repository.CareersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CareersController {

    private CareersRepository repository;

    @Autowired
    public CareersController(CareersRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(value = "/careers", method = RequestMethod.GET)
    public String index(Model model) {
        Iterable<Career> careers = repository.findAll();
        model.addAttribute("careers", careers);
        return "careers/index";
    }

    @RequestMapping(value ="/careers/applyNow", method = RequestMethod.GET)
    public String applyNow(@RequestParam(value="id") long id, Model model) {
        Career c= repository.findById(Long.valueOf(id))
        .orElseThrow(() -> new RuntimeException("Cannot find resource with id"));
            
        model.addAttribute("career", c);
        return "careers/application";
    }

}