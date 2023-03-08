package com.example.Bibli.controller;

import com.example.Bibli.service.AuthorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/authors")
public class AuthorsController {

    @Autowired
    AuthorsService authorsService;

    @GetMapping("all")
    public String showAllAuthors (Model model) {
        model.addAttribute("authors", authorsService.findAll());
        return "authors";
    }

    @GetMapping("/{id}")
    public String showOneAuthors (@PathVariable("id") Long id, Model model) {
        model.addAttribute("authors", authorsService.findOne(id));
        return "showAllAuthors";
    }

    @GetMapping("books")
    public String showAllBooks (Model model) {
        model.addAttribute("authors", authorsService.findAllBooks());
        return "authors";
    }
}
