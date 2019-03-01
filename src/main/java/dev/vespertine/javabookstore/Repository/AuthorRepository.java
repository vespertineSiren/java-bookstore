package dev.vespertine.javabookstore.Repository;

import dev.vespertine.javabookstore.Models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
