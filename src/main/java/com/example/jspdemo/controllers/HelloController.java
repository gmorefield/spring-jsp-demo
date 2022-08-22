package com.example.jspdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping({ "/", "hello" })
    public String index(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("title", "Spring Boot 2 JSP Demo");
        model.addAttribute("name", name);

        return "hello";
    }
}
