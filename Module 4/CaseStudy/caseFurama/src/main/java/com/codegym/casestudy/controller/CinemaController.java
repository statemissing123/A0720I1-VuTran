package com.codegym.casestudy.controller;

import com.codegym.casestudy.Service.CinemaService;
import com.codegym.casestudy.model.Cinema;
import com.codegym.casestudy.model.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping("/cinema")
public class CinemaController {

    @Autowired
    CinemaService cinemaService;

    @GetMapping("/")
    public ModelAndView getListCustomer(@RequestParam("s") Optional<Long> s, @PageableDefault(size = 4) Pageable pageable) {
        Page<Cinema> cinemaPage;
        if (s.isPresent()) {
            cinemaPage = cinemaService.findAllByPriceContaining(s.get(),pageable);
        } else {
            cinemaPage = cinemaService.findAll(pageable);
        }
        return new ModelAndView("cinema/list", "cinemas", cinemaPage);
    }

    //tạo customer//
    @GetMapping("/create")
    public ModelAndView formCreateCinema() {
        return new ModelAndView("cinema/create", "cinemas", new Cinema());
    }

    @PostMapping("/create")
    public String createCustomer(@Validated @ModelAttribute("cinemas") Cinema cinema, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "/cinema/create";
        }else {
            cinemaService.save(cinema);
            return "redirect:/cinema/";
        }
    }

    //Xóa customer//
    @GetMapping("/delete/{id}")
    public ModelAndView getFormDelete(@PathVariable int id) {
        return new ModelAndView("cinema/delete", "cinemas", cinemaService.findById(id));
    }
    @PostMapping("/delete/{id}")
    public String deleteCinema(@PathVariable int id){
        cinemaService.delete(id);
        return "redirect:/cinema/";
    }

}
