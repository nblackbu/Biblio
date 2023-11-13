package library.repo;

import library.entity.Genres;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface GenresRepository extends JpaRepository<Genres,Long>  {
}
