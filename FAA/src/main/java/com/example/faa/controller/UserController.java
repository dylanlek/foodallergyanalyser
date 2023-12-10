package com.example.faa.controller;

import com.example.faa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserService userService;



    @GetMapping("userinfo")
    public String userinfo(Model allergens){
        return "userinfo";
    }

    @PostMapping("userinfo")
    public String addAllergen() {
        //implement code so that it fetches data from the webpage and sends it to the database
        return "userinfo";
    }
}