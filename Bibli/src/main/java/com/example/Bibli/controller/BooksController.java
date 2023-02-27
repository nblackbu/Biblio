package com.example.Bibli.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/number")
public class BooksController {
    @GetMapping("/hello-world")
    public String sayHello() {
        return "hello";
    }
}
