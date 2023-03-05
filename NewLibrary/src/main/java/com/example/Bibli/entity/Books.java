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
    public Books(String book_name) {
        this.book_name = book_name;
    }

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

    @Column(name = "authors_name")
    private String authorsName;

    @Column(name = "authors_surname")
    private String authorsSurname;

    @Column(name = "authors_lastname")
    private String authorsLastname;

    private int quantity;

    @ManyToMany
    @JoinTable(
            name = "books_and_genres",
            joinColumns = @JoinColumn(name="book_id"),
            inverseJoinColumns = @JoinColumn(name="genre_id"))
    private List<Genres> genres;
}