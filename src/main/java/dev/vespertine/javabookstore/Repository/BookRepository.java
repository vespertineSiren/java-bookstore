package dev.vespertine.javabookstore.Repository;

import dev.vespertine.javabookstore.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
