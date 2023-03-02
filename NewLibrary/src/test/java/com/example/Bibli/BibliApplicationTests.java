package com.example.Bibli;

import com.example.Bibli.repo.BooksRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BibliApplicationTests {
	@Autowired
	BooksRepository booksRepository;
	@Test
	void contextLoads() {
		System.out.println(booksRepository.findAll());
	}

}
