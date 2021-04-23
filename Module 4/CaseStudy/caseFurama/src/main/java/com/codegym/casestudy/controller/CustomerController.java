package com.codegym.casestudy.controller;

import com.codegym.casestudy.Service.CustomerService;
import com.codegym.casestudy.model.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/")
    public ModelAndView getListCustomer(@RequestParam("s")Optional<String> s, @PageableDefault(size = 4) Pageable pageable) {
        Page<Customer> customerPage;
        if (s.isPresent()) {
            customerPage = customerService.findAllByNameContaining(s.get(),pageable);
        } else {
            customerPage = customerService.findAll(pageable);
        }
        return new ModelAndView("customers/list", "listCustomers", customerPage);
    }

    //tạo customer//
    @GetMapping("/create")
    public ModelAndView formCreateCustomer() {
        return new ModelAndView("customers/create", "createCustomer", new Customer());
    }

    @PostMapping("/create")
    public String createCustomer(@ModelAttribute("createCustomer") Customer customer) {
        customerService.save(customer);
        return "redirect:/customers/";
    }

    //Thông tin customer//
    @GetMapping("/info/{id}")
    public ModelAndView infoCustomer(@PathVariable int id) {
        return new ModelAndView("customers/info", "infoCustomer", customerService.findById(id));
    }

    //Xóa customer//
    @GetMapping("/delete/{id}")
    public ModelAndView getFormDelete(@PathVariable int id) {
        return new ModelAndView("customers/delete", "deleteCustomer", customerService.findById(id));
    }
    @PostMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable int id){
        customerService.delete(id);
        return "redirect:/customers/";
    }

    //Sửa Customer//
    @GetMapping("/edit/{id}")
    public ModelAndView getFormEdit(@PathVariable int id){
        System.out.println("Hello");
        return new ModelAndView("customers/edit","editCustomer",customerService.findById(id));
    }
    @PostMapping("/edit/{id}")
    public String editCustomer(@ModelAttribute("editCustomer") Customer customer){
        customerService.save(customer);
        return "redirect:/customers/info/"+customer.getId();
    }



}
