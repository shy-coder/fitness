package com.jifeng.fitness.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TestController {


    @GetMapping("/test")
    public String Test() {

        return "article";
    }
}
