package library.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="users")



public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @OneToMany(mappedBy = "users")
//    List<Reviews> reviews;

    @ManyToMany
    @JoinTable(
            name = "books_and_users",
            joinColumns = @JoinColumn(name="user_id"),
            inverseJoinColumns = @JoinColumn(name="books_id"))
    private List<Books> books;

    private String name;
    private String surname;
    private String lastname;

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
