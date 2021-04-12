package com.codegym.giohang.controller;

import com.codegym.giohang.model.User;
import com.codegym.giohang.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@SessionAttributes("user")
@RequestMapping("/login")
public class UserController {

    @Autowired
    ProductService productService;

    @ModelAttribute("user")
    public User user(){
        return new User();
    }
    @GetMapping("")
    public ModelAndView getIndex(@CookieValue(name = "username",defaultValue = "")String username,
                                 Model model){
        model.addAttribute("username",username);
        return new ModelAndView("login");
    }
    @PostMapping("/")
    public String doLogin(@ModelAttribute("user") User user,
                                @CookieValue(value = "username",defaultValue = "")String username,
                                HttpServletResponse response,
                                HttpServletRequest request,
                                Model model){
        Cookie cookie = new Cookie("username",user.getUsername());
        cookie.setMaxAge(60*60*24);
        cookie.setSecure(true);
        cookie.setHttpOnly(true);
        cookie.setPath("/");
        response.addCookie(cookie);
        if("admin2611".equals(user.getUsername()) && "123".equals(user.getPassword())){
//            get all cookies
            Cookie[] cookies = request.getCookies();
            for (Cookie ck : cookies) {
                if("username".equals(ck.getName())){
                    model.addAttribute("username",username);
                    break;
                }
            }
            model.addAttribute("message", "Login success. Welcome ");
            return "redirect:/";
        }else {
            model.addAttribute("username",username);
            model.addAttribute("message", "Login failed. Try again.");
        }
        return "login";
    }
}
