package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/admin")
    public String showAllUsers(Model model) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("admen", user);
        return "index";
    }

    @GetMapping("/user")
    public String showUserForUser(Model userModel) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        userModel.addAttribute("man", user);
        return "user";
    }

}
