package codegym.controller;

import codegym.model.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class SaveEmailController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showForm(ModelMap model) {
        model.addAttribute("email",  new Email("Chinese","10",true,"khue"));
        return "show";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(@ModelAttribute("email") Email email, ModelMap model) {
        model.addAttribute("email",email);
        return "info";
    }
}
