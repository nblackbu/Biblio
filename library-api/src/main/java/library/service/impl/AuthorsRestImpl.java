package library.service.impl;

import library.criteria.AuthorsCriteria;
import library.entity.AuthorsEntity;
import library.repo.AuthorsRepository;
import library.service.AuthorsRest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@AllArgsConstructor
@RestController
@Slf4j
@Service
public class AuthorsRestImpl implements AuthorsRest {

    @Autowired
    private final AuthorsRepository authorsRepository;
    @Override
    public String get() {
//        Page<AuthorsEntity> authorsEntityPage = authorsRepository.findAll(AuthorsCriteria);
//        ArrayList<String> s = new ArrayList<>();
//        s.add("Hello");
        String s = "privet";
        return s;
    }
}
