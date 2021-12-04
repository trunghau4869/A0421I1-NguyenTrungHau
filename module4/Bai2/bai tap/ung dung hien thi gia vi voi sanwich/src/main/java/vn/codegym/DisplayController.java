package vn.codegym;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DisplayController {
    @GetMapping("/save")
    public String show(){
        return "index";
    }
    @PostMapping("/save")
    public String save(String Lettuce ,String Tomato ,String Mustard ,String Sprouts, Model model) {
        model.addAttribute("Lettuce",Lettuce);
        model.addAttribute("Tomato",Tomato);
        model.addAttribute("Mustard",Mustard);
        model.addAttribute("Sprouts",Sprouts);
        return "resuilt";
    }
}
