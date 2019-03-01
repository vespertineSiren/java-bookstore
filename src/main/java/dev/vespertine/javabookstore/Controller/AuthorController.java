package dev.vespertine.javabookstore.Controller;

import dev.vespertine.javabookstore.Models.Author;
import dev.vespertine.javabookstore.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/authors/", produces = MediaType.APPLICATION_JSON_VALUE)
public class AuthorController {

    @Autowired
    AuthorRepository authorRepository;

    @GetMapping(value = "/authors")
    public List<Author> getAllAuthorsfromBookStore(){
        return authorRepository.findAll();
    }
}
