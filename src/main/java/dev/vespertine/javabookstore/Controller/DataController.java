package dev.vespertine.javabookstore.Controller;

import dev.vespertine.javabookstore.Models.Book;
import dev.vespertine.javabookstore.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.Optional;

@RestController
@RequestMapping(value = "/data", produces = MediaType.APPLICATION_JSON_VALUE)
public class DataController {

    @Autowired
    BookRepository bookRepository;



    @PutMapping(value = "/books/{id}")
    public Book updateBookById(@RequestBody Book newBook, @PathVariable long bookid) throws URISyntaxException {
        Optional<Book> bookUpdate = bookRepository.findById(bookid);
        if (bookUpdate.isPresent()) {
            newBook.setBookid(bookid);
            bookRepository.save(newBook);
            return newBook;
        }
        return null;
    }

    @DeleteMapping("/books/{bookid}")
    public Book deleteBookById(@PathVariable long bookid){
        Optional<Book> foundB = bookRepository.findById(bookid);
        if(foundB.isPresent()) {
            bookRepository.deleteById(bookid);
            return foundB.get();
        } else { return null;}

    }

}
