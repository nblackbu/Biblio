package com.example.Bibli.repo;

import com.example.Bibli.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface BooksRepository extends JpaRepository<Books,Long> {

}
