package dev.vespertine.javabookstore.Repository;

import dev.vespertine.javabookstore.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
