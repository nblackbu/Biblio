package library.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.List;

@Entity
@Service
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "authors")

public class AuthorsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @OneToMany(mappedBy = "authors")
//    private List<Books> books;

    private String name;
    private String surname;
    private String lastname;
}
