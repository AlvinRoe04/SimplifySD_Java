package com.simplify.ssdbackend.controller;

import com.simplify.ssdbackend.exception.UserNotFoundException;
import com.simplify.ssdbackend.model.User;
import com.simplify.ssdbackend.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000") //TODO test if I can get rid of this upon deployment
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    User newUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @GetMapping("/users")
    List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    User getUserById(@PathVariable Long id){
        return userRepository.findById(id)
            .orElseThrow(() -> new UserNotFoundException(id));
    }

    @PutMapping("/user/{id}")
    User updateUser(@RequestBody User user, @PathVariable Long id){
        return userRepository.findById(id)
            .map(u -> {
                u.setName(user.getName());
                u.setUsername(user.getUsername());
                u.setEmail(user.getEmail());
                return userRepository.save(u);
            })
            .orElseThrow(() -> new UserNotFoundException(id));
    }

    @DeleteMapping("/user/{id}")
    void deleteUser(@PathVariable Long id){
        if(!userRepository.existsById(id))
            throw new UserNotFoundException(id);

        userRepository.deleteById(id);
    }
}
