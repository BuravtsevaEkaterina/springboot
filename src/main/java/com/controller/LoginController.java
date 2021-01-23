package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LoginController {

    @GetMapping("/")
    public String hello() {
        return "hello";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

}
