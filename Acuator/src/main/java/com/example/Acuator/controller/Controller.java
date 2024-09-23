package com.example.Acuator.controller;

import com.example.Acuator.model.User;
import com.example.Acuator.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class Controller {

    @Autowired
    UserRepo userRepository;

    


    @GetMapping("/home")
    public String home(){
        return "Hello world";
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/paging")
    public List<User> getAllUsersWith(@RequestParam int page, @RequestParam int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<User> userPage = userRepository.findAll(pageable);
        return userPage.getContent();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PostMapping("/bulk")
    public List<User> createUsers(@RequestBody List<User> users) {
        return userRepository.saveAll(users);
    }

}
