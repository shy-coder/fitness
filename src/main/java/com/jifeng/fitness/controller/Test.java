package com.jifeng.fitness.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {
    @RequestMapping("/column")
    public  String test(Model model){
        return "column";
    }
}