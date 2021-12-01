package vn.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DictionaryController {
    @GetMapping("/dictionary")
    public String display(){
        return "display";
    }
    @PostMapping("/dictionary")
    public String showResuilt(){
        return "dictionary";
    }
}
