package dev.vespertine.javabookstore.Service;


import dev.vespertine.javabookstore.Models.User;

import java.util.List;

public interface UserService {

    User save(User user);
    List<User> findAll();
    void delete(long id);
}
