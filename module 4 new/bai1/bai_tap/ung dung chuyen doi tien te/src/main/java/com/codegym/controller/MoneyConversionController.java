package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MoneyConversionController {

    @GetMapping("/")
    public String show(){

        return index;
    }
}
