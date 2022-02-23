package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MoneyConversionController {

    @GetMapping("/")
    public String show(){
        return "input";
    }

    @PostMapping("/convert")
    public String convert( @RequestParam String  inputText , Model model){
        if(inputText.equals("House")){
            model.addAttribute("NgoiNha",inputText);
        }


//        model.addAttribute("resuilt",resuilt);
        return "index";

    }
}
