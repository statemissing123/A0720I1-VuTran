package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.CalculatorService;

@Controller
public class Calculator {
    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/index")
    public ModelAndView viewIndex() {
        return new ModelAndView("index");
    }

    @PostMapping("/calculator")
    public ModelAndView calculator(@RequestParam(value = "num1", defaultValue = "0") Long num1,
                                   @RequestParam(value = "num2", defaultValue = "0") Long num2, @RequestParam("cal") String cal) {
        try {
            Long result = calculatorService.calculator(num1, num2, cal);
            ModelAndView modelAndView = new ModelAndView("index");
            modelAndView.addObject("num1", num1);
            modelAndView.addObject("num2", num2);
            modelAndView.addObject("cal", cal);
            modelAndView.addObject("result", result);
            return modelAndView;
        } catch (Exception e) {
            return new ModelAndView("index", "message", e.getMessage());
        }

    }
}
