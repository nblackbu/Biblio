package com.example.Bibli.service;

import com.example.Bibli.entity.Books;
import com.example.Bibli.repo.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

@Service
public class BooksService {
    @Autowired
    BooksRepository booksRepository;

    public List<Books> getAllBooks() {
        return this.booksRepository.findAll();
    }
    public Books findOne(Long id) {
        Optional<Books> foundBook = booksRepository.findById(id);
        return foundBook.orElse(null);
    }

    @Transactional
    public void delete(Long id) {
        booksRepository.deleteById(id);
    }

    @Transactional
    public void update(Long id, Book updatedBook) {
        Books bookToBeUpdated = booksRepository.findById(id).get();
    }
}
