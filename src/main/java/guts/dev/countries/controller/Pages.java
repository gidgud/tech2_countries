package guts.dev.countries.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Pages {

    @GetMapping("/")
    public String index(Model model) {
        return "home/index";
    }
}
