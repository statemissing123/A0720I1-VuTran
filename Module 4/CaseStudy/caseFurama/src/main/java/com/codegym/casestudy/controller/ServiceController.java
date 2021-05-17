package com.codegym.casestudy.controller;

import com.codegym.casestudy.Service.ServicesService;
import com.codegym.casestudy.model.service.FuramaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/services")
public class ServiceController {
    @Autowired
    ServicesService servicesService;

    @GetMapping("/")
    public ModelAndView getListService(){
        return new ModelAndView("services/list","furamaService",servicesService.findAll());
    }

    @GetMapping("/create")
    public ModelAndView getFormCreate(){
        return new ModelAndView("services/create","furamaService",new FuramaService());
    }
    @PostMapping("/create")
    public String createService(@ModelAttribute FuramaService furamaService){
        servicesService.save(furamaService);
        return "redirect:/services/";
    }
}
