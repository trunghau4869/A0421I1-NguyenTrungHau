package vn.codegym;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CaculatorController {
    @RequestMapping(value = "/")
    public String caculator(){
        return "display";
    }
    @RequestMapping(value = "/display", method = RequestMethod.POST)
    public String show( double num1,double num2, Model model){
        model.addAttribute("num1",num1);
        model.addAttribute("num2",num2);
        return "resuilt";
    }
}
