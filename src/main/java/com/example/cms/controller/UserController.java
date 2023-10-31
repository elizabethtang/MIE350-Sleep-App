package com.example.cms.controller;

import com.example.cms.controller.exceptions.UserNotFoundException;
import com.example.cms.model.entity.User;
import com.example.cms.model.entity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class UserController {
    @Autowired
    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/users")
    List<User> retrieveAllUsers() {
        return repository.findAll();
    }

    @PostMapping("/users/create")
    public String createUser(@RequestBody User newUser) {
        //if username already exists return this
        if (repository.existsByUsername(newUser.getUsername()) > 0) {
            return "Username already exists. User creation failed.";
        }
        // Save the new user to the repository
        User savedUser = repository.save(newUser);
        return "User created successfully, please continue to login page.";
    }

    @GetMapping("/users/{username}/{password}")
    User retrieveUser(@PathVariable("username") String username, @PathVariable("password") String password) {
        User user = repository.findById(username, password);

        if (user == null) {
            throw new UserNotFoundException(username);
        }

        return user;
    }


//
//    @PutMapping("/users/{id}")
//    User updateUser(@RequestBody User newUser, @PathVariable("id") Long userId) {
//        return repository.findById(userId)
//                .map(user -> {
//                    user.setFirstName(newUser.getFirstName());
//                    user.setLastName(newUser.getLastName());
//                    return repository.save(user);
//                })
//                .orElseGet(() -> {
//                    newUser.setId(userId);
//                    return repository.save(newUser);
//                });
//    }
//
//    @DeleteMapping("/users/{id}")
//    void deleteUser(@PathVariable("id") Long userId) {
//        repository.deleteById(userId);
//    }
//
//    @GetMapping("/users/search/{searchstring}")
//    List<User> searchUser(@PathVariable("searchstring") String searchString) {
//        return repository.search(searchString);
//    }
//
//    @GetMapping("/users/top")
//    List<User> retrieveTopUsers() {
//        return repository.findTopUsers();
//    }
}
