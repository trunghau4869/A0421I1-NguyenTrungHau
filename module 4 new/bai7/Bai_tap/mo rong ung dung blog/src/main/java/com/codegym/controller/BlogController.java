package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.model.Category;
import com.codegym.service.BlogService;
import com.codegym.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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
    @Autowired
    public CategoryService categoryService;

    @GetMapping("")
    public String defaultSite(@PageableDefault(size = 2) Pageable pageable, Model model) {
        Page<Blog> blogs = blogService.findAll(pageable);
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
        List<Category> category=categoryService.findAll();
        model.addAttribute("blog", new Blog());
        model.addAttribute("category", category);
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
