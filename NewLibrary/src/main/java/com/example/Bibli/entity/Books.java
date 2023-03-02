package com.example.Bibli.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity(name="books")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Books {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(mappedBy = "books")
    private List<Users> users;

    private String book_name;

    private int publishingYear;

    @ManyToOne
    @JoinColumn(name="author_id", referencedColumnName = "id")
    private Authors authors;

    @ManyToMany
    @JoinTable(
            name = "books_and_genres",
            joinColumns = @JoinColumn(name="book_id"),
            inverseJoinColumns = @JoinColumn(name="genre_id"))
    private List<Genres> genres;
}