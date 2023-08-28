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

    @PostMapping
    ResponseEntity<?> createUser(@RequestBody User user) {
        try {
            User savedUser = userRepository.save(user);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
        } catch (Exception ex) {
            String ErrorMsg = "Error when creating user: " + ex.getMessage();

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ErrorMsg);
        }
    }

    @DeleteMapping
    public ResponseEntity<String> deleteAllUsers() {
        try {
            long recordsDeleted = userRepository.count();

            userRepository.deleteAll();

            return ResponseEntity.ok("Users records dropped: " + recordsDeleted);
        }
        catch(Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Can't execute delete method");
        }
    }
}
