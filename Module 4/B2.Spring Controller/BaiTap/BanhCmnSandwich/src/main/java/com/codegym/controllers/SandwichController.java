package com.codegym.controllers;


import com.codegym.model.Sandwich;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SandwichController {
    static List<String> listCondiments = new ArrayList<>();
    static {
        listCondiments.add("Lettuce");
        listCondiments.add("Tomato");
        listCondiments.add("Mustard");
        listCondiments.add("Sprouts");
    }

    @GetMapping("/")
    public ModelAndView showCondiment(){
        ModelAndView modelAndView = new ModelAndView("sandwich");
        modelAndView.addObject("sandwich",new Sandwich());
        modelAndView.addObject("giavi",this.listCondiments);
        return modelAndView;
    }

    @PostMapping("/create-sandwich")
    public String createSandwich(@ModelAttribute Sandwich sandwich, Model model){
        System.out.println(sandwich.getGiavi());
        model.addAttribute("sandwich",sandwich.getGiavi());
        return "sandwichCreated";
    }
}
