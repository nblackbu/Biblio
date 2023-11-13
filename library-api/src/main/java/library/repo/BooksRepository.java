package library.repo;

import library.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface BooksRepository extends JpaRepository<Books,Long> {

}
