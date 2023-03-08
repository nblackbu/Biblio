package com.example.Bibli.service;

import com.example.Bibli.entity.Authors;
import com.example.Bibli.repo.AuthorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

@Service
public class AuthorsService {
    @Autowired
    AuthorsRepository authorsRepository;

    public Authors findOne(Long id) {
        Optional<Authors> foundAuthors = authorsRepository.findById(id);
        return foundAuthors.orElse(null);
    }

    public List<Authors> findAll() {
        return this.authorsRepository.findAll();
    }

    public List<Book> findAllBooks() {
        return this.findAllBooks();
    }
}
