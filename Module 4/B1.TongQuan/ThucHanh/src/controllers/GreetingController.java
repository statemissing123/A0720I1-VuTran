package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {

    @RequestMapping(value = "/greeting")
    public String greeting(Model model){
        model.addAttribute("message","John");
        return "greeting";
    }
}
