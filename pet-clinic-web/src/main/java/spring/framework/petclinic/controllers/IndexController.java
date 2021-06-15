package spring.framework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})
    String index() {
        return "index";
    }

    @RequestMapping("/oups")
    public String oups(Model model){
        model.addAttribute("message", "Error");
        return "error";
    }
}
