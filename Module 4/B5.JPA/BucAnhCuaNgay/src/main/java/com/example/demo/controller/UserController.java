package com.example.demo.controller;

import com.example.demo.model.UserFeedBack;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    static List<Integer> stars = new ArrayList<>();
    static {
        stars.add(1);
        stars.add(2);
        stars.add(3);
        stars.add(4);
        stars.add(5);
    }
    @GetMapping("/")
    public String viewFeedBack(Model model){
        model.addAttribute("stars",stars);
        model.addAttribute("feedback",new UserFeedBack());
        return "view";
    }

    @PostMapping("/create")
    public String createComment(@ModelAttribute UserFeedBack userFeedBack){
        userService.save(userFeedBack);
        return "view";
    }


}
