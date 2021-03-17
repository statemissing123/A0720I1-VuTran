package com.codegym.crud.qlkhachhang.controllers;

import com.codegym.crud.qlkhachhang.models.Customer;
import com.codegym.crud.qlkhachhang.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CustomerController {
    @Autowired
    ICustomerService iCustomerService;

    @GetMapping("/")
    public ModelAndView getCustomerList(){
        return new ModelAndView("list","customers",iCustomerService.findAll());
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
