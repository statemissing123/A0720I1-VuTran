package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import sun.security.mscapi.CPublicKey;


import java.util.Optional;

@Controller
public class BlogController {

    @Autowired
    BlogService blogService;

    @GetMapping("/")
    public ModelAndView getBlogList(@RequestParam("s")Optional<String> s,@PageableDefault(size = 3) Pageable pageable){
        Page<Blog> blogPage;
        if (s.isPresent()){
            blogPage=blogService.findAllByTitleBlogContaining(s.get(),pageable);
        }else {
            blogPage=blogService.findAll(pageable);
        }
        return new ModelAndView("list","blogs",blogPage);
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
