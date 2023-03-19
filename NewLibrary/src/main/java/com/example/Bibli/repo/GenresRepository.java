package com.example.Bibli.repo;

import com.example.Bibli.entity.Genres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenresRepository extends JpaRepository<Genres,Long>  {
}
