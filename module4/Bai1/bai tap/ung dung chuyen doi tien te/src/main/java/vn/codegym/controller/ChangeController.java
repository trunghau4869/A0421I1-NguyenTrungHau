package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ChangeController {

    @GetMapping("/change")
    public String showChange() {
        return "display";
    }

    @PostMapping("/change")
    public String change(@RequestParam double USD, Model model) {

        double resuilt=change(USD);
        model.addAttribute("resuilt", resuilt);
        model.addAttribute("USD", USD);
        return "resuilt";
    }
    public double change(double usd) {
        double resuiltChange=usd*22.693;
        return resuiltChange;
    }
}
