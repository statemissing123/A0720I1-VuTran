package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import sun.security.mscapi.CPublicKey;

@Controller
public class BlogController {

    @Autowired
    BlogService blogService;

    @GetMapping("/")
    public ModelAndView getBlogList(){
        return new ModelAndView("list","blogs",blogService.findAll());
    }
    @GetMapping("/create")
    public ModelAndView getBlogCreate(){
        return new ModelAndView("create","blog",new Blog());
    }
    @GetMapping("/edit/{id}")
    public ModelAndView getFormEdit(@PathVariable Integer id){
        return new ModelAndView("edit","blog",blogService.findById(id));
    }
    @GetMapping("/delete/{id}")
    public ModelAndView getFormDelete(@PathVariable Integer id){
        return new ModelAndView("delete","blog",blogService.findById(id));
    }
    @PostMapping("/create")
    public String blogCreate(@ModelAttribute Blog blog){
        blogService.save(blog);
        return "redirect:/";
    }
    @PostMapping("/edit/{id}")
    public String editBlog(@PathVariable int id,@ModelAttribute Blog blog){
        blog.setId(id);
        blogService.save(blog);
        return "redirect:/";
    }
    @PostMapping("/delete/{id}")
    public String DeleteID(@PathVariable int id , @ModelAttribute Blog blog){
        blog.setId(id);
        blogService.delete(id);
        return "redirect:/";
    }
}
