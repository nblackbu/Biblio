package com.example.Bibli.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity(name="users")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "users")
    List<Reviews> reviews;

    @ManyToMany
    @JoinTable(
            name = "books_and_users",
            joinColumns = @JoinColumn(name="user_id"),
            inverseJoinColumns = @JoinColumn(name="books_id"))
    private List<Books> books;

    private String name;
    private String surname;
    private String lastname;

    @Temporal(TemporalType.DATE)
    private Long birthday;

    private String status;

    @ManyToMany
    @JoinTable(
            name = "roles_and_users",
            joinColumns = @JoinColumn(name="user_id"),
            inverseJoinColumns = @JoinColumn(name="role_id"))
    private List<Roles> roles;

    private String phone;

    private String login;
    private String password;
}
