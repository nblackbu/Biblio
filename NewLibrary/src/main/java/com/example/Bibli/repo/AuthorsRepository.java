package com.example.Bibli.repo;

import com.example.Bibli.entity.Authors;
import com.example.Bibli.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthorsRepository extends JpaRepository<Authors,Long>  {
}
