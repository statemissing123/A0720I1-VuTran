package com.codegym.giohang.controller;

import com.codegym.giohang.model.Cart;
import com.codegym.giohang.model.Product;
import com.codegym.giohang.model.User;
import com.codegym.giohang.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@SessionAttributes({"cart", "user"})
public class ProductController {
    @ModelAttribute("cart")
    public Cart cart(){
        return new Cart();
    }

    @ModelAttribute("user")
    public User user(){
        return new User();
    }
    @Autowired
    ProductService productService;

    @GetMapping("/")
    public ModelAndView getForm(@SessionAttribute("user")User user){
        return new ModelAndView("products","products",productService.findAll());
    }

    @GetMapping("/add/{id}")
    public ModelAndView addToCart(@PathVariable int id){
        return new ModelAndView("addtocart",
                "product",productService.findById(id));
    }
    @GetMapping("/addproduct/{id}")
    public String addToCartID(@ModelAttribute("cart") Cart cart,
                              @PathVariable int id){
        cart.addProduct(productService.findById(id));
        return "redirect:/";
    }
    @GetMapping("/cart")
    public ModelAndView getListCart(@ModelAttribute("cart")Cart cart, Model model) {
        model.addAttribute("totalprice",cart.getPrice());
        return new ModelAndView("carts","cart",cart);
    }
//    @GetMapping("/cart")
//    public ModelAndView getListCart(@ModelAttribute("cart")Cart cart, Model model) {
//        model.addAttribute("totalprice",cart.getPrice());
//        return new ModelAndView("carts","cart",cart);
//    }
    @GetMapping(value = "/editcart/{id}")
    public String editCart(@ModelAttribute("cart")Cart cart,
                           @PathVariable int id,
                           Product product){
        productService.findById(id);
        return "redirect:/cart";
    }
    @GetMapping(value = "/delete/{id}")
    public String deleteCart(@ModelAttribute("cart")Cart cart,
                             @PathVariable int id){
        productService.delete(id);
        return "redirect:/cart";
    }

}
