package com.example.Bibli.controller;

import com.example.Bibli.service.AuthorsService;
import com.example.Bibli.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/library")
public class HomeController {

    @Autowired
    BooksService booksService;

    @Autowired
    AuthorsService authorsService;
    @GetMapping("")
    public String books(Model model) {
        model.addAttribute("books", booksService.getAllBooks());
        model.addAttribute("authors", authorsService.getAllAuthors());
        return "home";
    }
}
