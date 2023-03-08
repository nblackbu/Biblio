package com.example.Bibli.controller;

import com.example.Bibli.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/books")
public class BooksController {

    @Autowired
    BooksService booksService;

    @GetMapping("all")
    public String books(Model model) {
        model.addAttribute("books", booksService.getAllBooks());
        return "books";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
        model.addAttribute("books", booksService.findOne(id));
        return "show";
    }

    @GetMapping("admin-books")
    public String adminBooks(Model model) {
        model.addAttribute("books", booksService.getAllBooks());
        return "adminBooks";
    }

//    @GetMapping("/{id}/edit")
//    public String edit(Model model, @PathVariable("id") Long id) {
//        model.addAttribute("book", booksService.findOne(id));
//        return "editBooks";
//    }
//
//    @DeleteMapping("/{id}")
//    public String delete(@PathVariable("id") Long id) {
//        booksService.delete(id);
//        return "redirect:/profile";
//    }

}
