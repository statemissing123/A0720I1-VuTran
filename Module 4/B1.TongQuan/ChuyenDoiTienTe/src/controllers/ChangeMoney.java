package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ChangeMoney {
    @RequestMapping(value = "/home")
    public ModelAndView getHomePage(){
        return new ModelAndView("home");
    }

    @RequestMapping(value = "/money")
    public String ChangeMoneys(@RequestParam float rate,@RequestParam float usd, Model model){
        float vnd = usd*23000;
        float dola = rate/23000;
        model.addAttribute("vnd", vnd);
        model.addAttribute("dola",dola);
        return "money";
    }
}
