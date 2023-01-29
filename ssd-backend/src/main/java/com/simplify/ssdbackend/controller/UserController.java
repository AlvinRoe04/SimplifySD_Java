package com.simplify.ssdbackend.controller;

import com.simplify.ssdbackend.model.User;
import com.simplify.ssdbackend.repository.User.UserRepository;
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
}
