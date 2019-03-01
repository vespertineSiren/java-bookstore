package dev.vespertine.javabookstore.Controller;

import dev.vespertine.javabookstore.Models.User;
import dev.vespertine.javabookstore.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;

@RestController
public class MgrController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/users")
    public List<User> listAllUsers(){
        return userRepository.findAll();
    }

    @DeleteMapping(value = "/user/{id}")
    public String deleteUserById(@PathVariable long id) {
        var foundUser = userRepository.findById(id);
        if(foundUser.isPresent()) {
            userRepository.deleteById(id);

            return "success";
        } else {
            return null;
        }
    }

    @PostMapping("/user")
    public User addANewUser(@RequestBody User user) throws URISyntaxException {
        return userRepository.save(user);
    }

}
