package com.example.lr5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
    @GetMapping("/hello")
    public String showMyFirstPage(@RequestParam (name="name",required=false, defaultValue="Katya")
                                  String name,
                                  Model model){
        model.addAttribute("name", name);
        return "my-first-page";
    }

}
