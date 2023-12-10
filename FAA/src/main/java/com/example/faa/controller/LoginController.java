package com.example.faa.controller;

import com.example.faa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @GetMapping("login")
    public String login() {
        return "login";
    }

    @PostMapping("login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
            return "dashboard";

    }
}


