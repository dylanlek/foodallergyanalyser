package com.example.faa.controller;

import com.example.faa.model.UserInfo;
import com.example.faa.repo.UserRepo;
import com.example.faa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SignupController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = {"signup"}, method = RequestMethod.GET)
    public ModelAndView signup() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("signup");
        return modelAndView;
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String createNewUser(UserInfo userInfo,
                                @RequestParam String username,
                                @RequestParam String email,
                                @RequestParam String password
    ) {
        userService.createUser(username,password,email);
        return "login";
    }
}
