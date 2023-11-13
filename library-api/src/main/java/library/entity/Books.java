package library.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="books")

public class Books {
    public Books(String book_name) {
        this.book_name = book_name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToMany(mappedBy = "books")
//    private List<Users> users;

    private String book_name;

    private int publishingYear;

//    @ManyToOne
//    @JoinColumn(name="author_id", referencedColumnName = "id")
//    private AuthorsEntity authors;

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