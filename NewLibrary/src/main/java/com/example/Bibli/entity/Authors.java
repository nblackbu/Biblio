package com.example.Bibli.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity(name="authors")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Authors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "authors")
    private List<Books> books;

    private String name;
    private String surname;
    private String lastname;
}
