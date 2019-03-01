package dev.vespertine.javabookstore.Controller;

import dev.vespertine.javabookstore.Models.Book;
import dev.vespertine.javabookstore.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path = "/books/", produces = MediaType.APPLICATION_JSON_VALUE)
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping
    public List<Book> getAllBooksfromBookStore(){
        return bookRepository.findAll();
    }
}
