package com.codegym.crud.qlkhachhang.controllers;

import com.codegym.crud.qlkhachhang.models.Customer;
import com.codegym.crud.qlkhachhang.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class CustomerController {
    @Autowired
    ICustomerService iCustomerService;

    @GetMapping("/")
    public ModelAndView getCustomerList(@RequestParam("s") Optional<String> s, @PageableDefault(size = 5)Pageable pageable){
        Page<Customer> customers;
        if (s.isPresent()){
            customers =iCustomerService.findAllByFirstNameContaining(s.get(),pageable);
        }else {
            customers =iCustomerService.findAll(pageable);
        }
        return new ModelAndView("list","customers",customers);
    }
    @GetMapping("/create")
    public ModelAndView getFormCreate(){
        return new ModelAndView("Create","customer",new Customer());
    }
    @PostMapping("/create")
    public String saveCustomer(@ModelAttribute Customer customer){
        iCustomerService.save(customer);
        return "redirect:/";
    }
    @GetMapping("/delete/{id}")
    public ModelAndView deleteID(@PathVariable Integer id){
        return new ModelAndView("delete","customer",iCustomerService.findById(id));
    }
    @PostMapping("/delete/{id}")
    public String delete(@PathVariable int id,@ModelAttribute Customer customer) {
        customer.setId(id);
        iCustomerService.delete(id);
        return "redirect:/";
    }
    @GetMapping("/edit/{id}")
    public ModelAndView getFormEdit(@PathVariable Integer id){
        return new ModelAndView("edit","customer",iCustomerService.findById(id));
    }
    @PostMapping("/edit/{id}")
    public String editCustomer(@PathVariable int id,@ModelAttribute Customer customer){
        customer.setId(id);
        iCustomerService.save(customer);
        return "redirect:/";
    }
}
