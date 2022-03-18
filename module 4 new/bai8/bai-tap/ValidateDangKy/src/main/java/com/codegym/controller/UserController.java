package com.codegym.controller;

import com.codegym.model.User;
import com.codegym.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("")
    public String result(){
        return "result";
    }
    @GetMapping("/create")
    public String createForm(Model model){

        model.addAttribute("user",new User());
        return "create";
    }
    @PostMapping("create")
    public String create(@Validated @ModelAttribute User user , BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model){
        new User().validate(user, bindingResult);
        if (bindingResult.hasFieldErrors()){
            return "create";
        }else {
            userService.save(user);
            redirectAttributes.addFlashAttribute("message", "Create success");
            return "redirect:/user";
        }

    }

}
