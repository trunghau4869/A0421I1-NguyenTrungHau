package com.codegym.controller;

import com.codegym.model.Division;
import com.codegym.model.education_degree;
import com.codegym.model.employee;
import com.codegym.model.Position;
import com.codegym.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.validation.BindingResult;

import java.util.List;

@Controller
//@RequestMapping("/furama")
public class MainController {
    @Autowired
    private IEmployeeService employeeService;
    @Autowired
    private IDivisionService divisionService;
    @Autowired
    private IPositionService positionService;
    @Autowired
    private IEducateDegreeService educationDegreeService;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/employee")
    public String list(@RequestParam(name = "nameCus", required = false) String name, @PageableDefault(size = 2) Pageable pageable, Model model) {
//        Page<employee> employees = employeeService.findByEmployee_name(name, pageable);
//        Page<employee> employees = employeeService.searchByEmployee_name(name, pageable);
        Page<employee> employees = employeeService.findAll(pageable);
        model.addAttribute("employee", employees);
        return "employee/list";
    }

    @GetMapping("/create")
    public String createEmployee(Model model) {
        List<Division> division = divisionService.findAll();
        model.addAttribute("division", division);
        List<Position> position = positionService.findAll();
        model.addAttribute("position", position);
        List<education_degree> education_degree = educationDegreeService.findAll();
        model.addAttribute("education_degree", education_degree);
        model.addAttribute("employee", new employee());
        return "employee/create";
    }

    @PostMapping("/create")
    public String saveEmployee(@Validated @ModelAttribute employee employee, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
//        new employee().validate(employee, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            List<Division> division = divisionService.findAll();
            model.addAttribute("division", division);
            List<Position> position = positionService.findAll();
            model.addAttribute("position", position);
            List<education_degree> education_degree = educationDegreeService.findAll();
            model.addAttribute("education_degree", education_degree);
            return "employee/create";
        } else {
            employeeService.save(employee);
            redirectAttributes.addFlashAttribute("message", "add employee success");
            return "redirect:/";
        }
    }

    @GetMapping("edit/{id}")
    public String editBlog(@PathVariable int id, Model model) {
        employee employee = employeeService.findById(id);
        model.addAttribute("employee", employee);
        return "employee/edit";
    }

    @PostMapping("edit")
    public String saveEdit(@ModelAttribute employee employees, RedirectAttributes redirectAttributes) {
        employeeService.save(employees);
        redirectAttributes.addFlashAttribute("message", "Update successful");
        return "redirect:/employee";
    }
//delete basic

    @GetMapping("delete/{id}")
    public String deleteEmployee(@PathVariable int id, Model model) {
        employee employee = employeeService.findById(id);
        model.addAttribute("employee", employee);
        return "employee/delete";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute employee employee, RedirectAttributes redirectAttributes) {
        employeeService.delete(employee);
        redirectAttributes.addFlashAttribute("message", "Delete successful");
        return "redirect:/employee";
    }

    //delete ajax

//    @GetMapping( "actionDelete/{id}")
//    public String deleteEmployee(@PathVariable int id,Model model){
//        employee employee=employeeService.findById(id);
//        model.addAttribute("employee", employee);
//        return "redirect:/employee";
//    }
//    @PostMapping(value = "delete/{id}")
//    public String deleteEmployee(@ModelAttribute employee employees,Pageable pageable,Model model ){
//        employeeService.delete(employees.getEmployee_id());
//        Page<employee> employeeList=employeeService.findAll(pageable);
//        model.addAttribute("employeeList",employeeList);
//        return "employee/list";
//
//    }
}
