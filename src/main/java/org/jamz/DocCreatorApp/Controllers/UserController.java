package org.jamz.DocCreatorApp.Controllers;

import org.jamz.DocCreatorApp.Models.User;
import org.jamz.DocCreatorApp.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userRepository.findAll();

        return ResponseEntity.ok(users);
    }

    @PostMapping ResponseEntity<User> createUser(@RequestBody User user) {
        User savedUser = userRepository.save(user);

        return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
    }

}
