package com.codegym.casestudy.controller;

import com.codegym.casestudy.Service.EmployeeService;
import com.codegym.casestudy.model.employee.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping("employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public ModelAndView getFormEmployee(@RequestParam("s") Optional<String> s, @PageableDefault(size = 4) Pageable pageable){
        Page<Employee> employeePage;
        if (s.isPresent()){
            employeePage = employeeService.findAllByNameContaining(s.get(),pageable);
        }else {
            employeePage = employeeService.findAll(pageable);
        }
        return new ModelAndView("employees/list","employees",employeePage);
    }

    @GetMapping("/create")
    public ModelAndView getFormCreate (){
        return new ModelAndView("employees/create","employees",new Employee());
    }

    @PostMapping("create")
    public String createEmployee(@ModelAttribute Employee employee){
        employeeService.save(employee);
        return "redirect:/employees";
    }

}
