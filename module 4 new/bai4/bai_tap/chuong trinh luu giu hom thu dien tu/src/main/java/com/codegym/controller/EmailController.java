package com.codegym.controller;

import com.codegym.model.Email;
import com.codegym.service.EmailService;
import com.codegym.service.IEmailService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/email")
public class EmailController {
    IEmailService emailService = new EmailService();
    private List<Email> emails = new ArrayList<>();

    @GetMapping("/showList")
    public String show(Model model) {
        List<Email> emails = emailService.getEmailList();
        model.addAttribute("emails", emails);
        return "list";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("email", emailService.finEmail(id));
        return "index";
    }
//    @PostMapping("/create")
//    public String create(@ModelAttribute("email") Email email) {
//        emails.add(email);
//        return "redirect:/list";
//    }


}
