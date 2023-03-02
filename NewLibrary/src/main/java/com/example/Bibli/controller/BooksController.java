package com.example.Bibli.controller;

import com.example.Bibli.entity.Books;
import com.example.Bibli.repo.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/number")
public class BooksController {
    @Autowired
    BooksRepository booksRepository;
    @GetMapping("/hello-world")
    public String sayHello() {
        return "hello";
    }

    @GetMapping("/books")
    public String books (Model model) {
        Iterable<Books> books = booksRepository.findAll();
        model.addAttribute("books", books);
        return "books";
    }

}
