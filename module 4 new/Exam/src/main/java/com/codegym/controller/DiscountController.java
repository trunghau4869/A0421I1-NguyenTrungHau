package com.codegym.controller;

import com.codegym.model.Discount;
import com.codegym.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDateTime;
import java.util.Optional;

@Controller

public class DiscountController {
    @Autowired
    private DiscountService discountService;

    @GetMapping("/")
    public String search(@RequestParam(name = "nameCus") Optional<String> name, @RequestParam(name = "timeStart") Optional<String> timeStart, @RequestParam(name = "timeEnd") Optional<String> timeEnd, @RequestParam(name = "discountStartEnd") Optional<String> discountStartEnd, @PageableDefault(size = 2) Pageable pageable, Model model) {
        Page<Discount> discounts;
        if (name.isPresent()) {
            discounts = discountService.findByName(name.get(), pageable);
            model.addAttribute("nameCus", name.get());
        } else if (timeStart.isPresent()) {
            discounts = discountService.findByTimeStart(timeStart.get(), pageable);
            model.addAttribute("timeStart", timeStart.get());

        } else if (timeEnd.isPresent()) {
            discounts = discountService.findByTimeEnd(timeEnd.get(), pageable);
            model.addAttribute("timeStart", timeEnd.get());
//        } else if (discountStartEnd.isPresent()) {
//            discounts = discountService.findByDiscountAndTimeEndAndTimeStart(name.get(),timeStart.get(),timeEnd.get(), pageable);
//            model.addAttribute("discountStartEnd", discountStartEnd.get());

        } else {
            discounts = discountService.findAll(pageable);
        }
        model.addAttribute("discounts", discounts);
        return "List";
    }

    @GetMapping("/create")
    public String createProduct(Model model) {
        model.addAttribute("discount", new Discount());
        return "Create";
    }

    @PostMapping("/create")
    public String saveProduct(@Validated @ModelAttribute Discount discount, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasFieldErrors()) {
//            if(discount.getTimeStart()> LocalDateTime.now()){}
            return "Create";
        } else {
            discountService.save(discount);
            redirectAttributes.addFlashAttribute("message", "add discount success");
            return "redirect:/";
        }
    }

    @GetMapping("delete/{id}")
    public String deleteProduct(@PathVariable int id, Model model) {
        Discount discount = discountService.findById(id);
        model.addAttribute("discount", discount);
        return "Delete";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute Discount discount, RedirectAttributes redirectAttributes) {
        discountService.delete(discount);
        redirectAttributes.addFlashAttribute("message", "Delete successful");
        return "redirect:/";
    }

    @GetMapping("edit/{id}")
    public String editProduct(@PathVariable int id, Model model) {
        Discount discount = discountService.findById(id);
        model.addAttribute("product", discount);
        return "Edit";
    }

    @PostMapping("edit")
    public String edit(@ModelAttribute Discount discount, RedirectAttributes redirectAttributes) {
        discountService.save(discount);
        redirectAttributes.addFlashAttribute("message", "Update successful");
        return "redirect:/";
    }

}
