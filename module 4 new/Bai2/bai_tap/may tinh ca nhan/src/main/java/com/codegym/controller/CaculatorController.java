package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaculatorController {
    @GetMapping("/")
    public String chooseCondiments() {
        return "index";
    }
    @PostMapping("/calculate")
    public String output(@RequestParam int num1 ,@RequestParam int num2 , Model model){

        int resuilt=num1 +num2;
        model.addAttribute("num1",num1);
        model.addAttribute("num2",num2);
        return "resuilt";
    }
}
