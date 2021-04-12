package com.codegym.thuchanh.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class DashBoardController {
    @GetMapping("/dashboard")
    public String login() {
        return "dashboard";
    }
}
