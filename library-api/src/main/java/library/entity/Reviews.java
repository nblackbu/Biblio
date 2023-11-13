package library.entity;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Table(name="reviews")

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

    @Column(name = "creation_date")
    private Long creationDate;
}
