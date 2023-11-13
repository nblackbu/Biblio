package library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/authors")
public class AuthorsController {

//    @Autowired
//    AuthorsService authorsService;


//    @GetMapping("all")
//    public String showAllAuthors (Model model) {
//        model.addAttribute("authors", authorsService.getAllAuthors());
//        return "authors";
//    }

//    @GetMapping("/{id}")
//    public String showOneAuthors (@PathVariable("id") Long id, Model model) {
//        model.addAttribute("authors", authorsService.findOne(id));
//        return "showAllAuthors";
//    }

//    @GetMapping("books")
//    public String showAllBooks (Model model) {
//        model.addAttribute("authors", authorsService.findAllBooks());
//        return "authors";
//    }
}
