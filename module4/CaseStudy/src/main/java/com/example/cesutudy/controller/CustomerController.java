package com.example.cesutudy.controller;

import com.example.cesutudy.model.Customer;
import com.example.cesutudy.model.CustomerType;
import com.example.cesutudy.repository.customer.CustomerTypeRepo;
import com.example.cesutudy.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
    CustomerTypeRepo customerTypeRepo;

    @ModelAttribute("listType")
    public List<CustomerType> getCustomerTypes() {
        return customerTypeRepo.findAll();
    }
    @GetMapping("/list")
    public String list(Model model) {
        return viewPage(model, 1);
    }
    @GetMapping("/list/page/{pageNum}")
    public String viewPage(Model model,
                           @PathVariable(name = "pageNum") int pageNum) {
        int pageSize=3;
        Page<Customer> page = customerService.findAllSort(pageNum, pageSize);

        List<Customer> listCustomer = page.getContent();

        model.addAttribute("currentPage", pageNum);
        model.addAttribute("totalPages", page.getTotalPages());
        model.addAttribute("totalItems", page.getTotalElements());
        model.addAttribute("listCustomer", listCustomer);

        return "/customer/list";
    }
    @GetMapping("/createGet")
    public ModelAndView showCreate() {
        ModelAndView modelAndView = new ModelAndView("/customer/create");
        modelAndView.addObject("customer", new Customer());
        return modelAndView;
    }
    @PostMapping("/create")
    public String create(@Valid @ModelAttribute Customer customer, BindingResult bindingResult, Model model, RedirectAttributes attributes) {
        if (bindingResult.hasFieldErrors()) {
            return "customer/create";
        }
        if (customerService.checkId(customer.getCustomerId())) {
            bindingResult.addError(new FieldError("customer", "customerId", "Customer's Id already exists!"));
            return "customer/create";
        }
        attributes.addFlashAttribute("msg", "Create customer: " + customer.getCustomerName() + " successful!");
        customerService.create(customer);
        return "redirect:/customer/list";
    }
    @GetMapping("/detail/{id}")
    public ModelAndView showDetail(@PathVariable String id) {
        ModelAndView modelAndView = new ModelAndView("/customer/detail");
        modelAndView.addObject("customer", customerService.findById(id));
        return modelAndView;
    }

    @GetMapping("/view/{id}")
    public ModelAndView showView(@PathVariable String id) {
        ModelAndView modelAndView = new ModelAndView("/customer/view");
        modelAndView.addObject("customer", customerService.findById(id));
        return modelAndView;
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable String id, RedirectAttributes attributes) {
        attributes.addFlashAttribute("msg", "Delete customer: " + customerService.findById(id).getCustomerName() + " successful!");
        customerService.delete(id);
        return "redirect:/customer/list";
    }

    @GetMapping("/search")
    public String search(@RequestParam String nameCus, Model model, @PageableDefault(value = 3) Pageable pageable) {
        model.addAttribute("listCustomer", customerService.findByName(nameCus, pageable));
        return "/customer/tableSearch";
    }

    @RequestMapping(value = "/autocomplete")
    @ResponseBody
    public Set<String> autoName(@RequestParam(value = "term", required = false, defaultValue = "") String term) {
        return customerService.selectName(term);
    }

}
