package com.example.Bibli.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="reviews")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Reviews {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String review;

    @ManyToOne
    @JoinColumn(name="user_id", referencedColumnName = "id")
    private Users users;

    @ManyToOne
    @JoinColumn(name="book_id", referencedColumnName = "id")
    private Books books;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "creation_date")
    private Long creationDate;
}
