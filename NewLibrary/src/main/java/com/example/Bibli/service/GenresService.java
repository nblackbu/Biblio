package com.example.Bibli.service;

import com.example.Bibli.entity.Genres;
import com.example.Bibli.repo.GenresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenresService {
    @Autowired
    GenresRepository genresRepository;

    public List<Genres> getAllBooks() {
        return this.genresRepository.findAll();
    }

    public Genres findOne(Long id) {
        Optional<Genres> foundBook = genresRepository.findById(id);
        return foundBook.orElse(null);
    }

}
