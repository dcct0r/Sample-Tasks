package com.example.sample_14.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlPage {
    @GetMapping("/home")
    public String getHtml() {
        return "index";
    }
}
