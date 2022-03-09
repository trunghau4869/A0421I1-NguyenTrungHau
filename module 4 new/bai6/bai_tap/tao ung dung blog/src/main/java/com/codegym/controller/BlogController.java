package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    public BlogService blogService;

    @GetMapping("")
    public String defaultSite(Model model) {
        List<Blog> blogs = blogService.findAll();
        model.addAttribute("blogs", blogs);
        return "list";
    }

    @GetMapping("/view/{id}")
    public String showDetail(@PathVariable int id, Model model) {
        Blog blog = blogService.findById(id);
        model.addAttribute("blogsDetail", blog);
        return "view";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping("/create")
    public String save(@ModelAttribute("blog") Blog blog, RedirectAttributes redirectAttributes) {
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("message", "Create successful");
        return "redirect:/blog";
    }

    @GetMapping("edit/{id}")
    public String editBlog(@PathVariable int id, Model model) {
        Blog blog = blogService.findById(id);
        model.addAttribute("blogDetail", blog);
        return "edit";
    }

    @PostMapping("edit")
    public String saveEdit(@ModelAttribute Blog blogDetail, RedirectAttributes redirectAttributes) {
        blogService.save(blogDetail);
        redirectAttributes.addFlashAttribute("message", "Update successful");
        return "redirect:/blog";
    }

    @GetMapping("/delete/{id}")
    public String showDelete(@PathVariable int id, Model model) {
        Blog blog = blogService.findById(id);
        model.addAttribute("blogDetail", blog);
        return "delete";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute Blog blogDetail, RedirectAttributes redirectAttributes) {
        blogService.delete(blogDetail.getId());
        redirectAttributes.addFlashAttribute("message", "Delete successful");
        return "redirect:/blog";
    }

}
