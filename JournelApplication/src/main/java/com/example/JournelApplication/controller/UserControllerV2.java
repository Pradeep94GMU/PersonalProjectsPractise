package com.example.JournelApplication.controller;

import com.example.JournelApplication.entity.Journel;
import com.example.JournelApplication.entity.User;
import com.example.JournelApplication.service.JournelService;
import com.example.JournelApplication.service.UserService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserControllerV2 {

    @Autowired
    private UserService userService;

    //Get all the users
    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAll();
    }

    //create a user
    @PostMapping
    public void createUser(@RequestBody User user){
        userService.createUser(user);
    }

    @GetMapping("/{username}")
    public ResponseEntity<User> getUserByName(@PathVariable String username){
        User user = userService.findByUserName(username);
        return new ResponseEntity<>(user, HttpStatus.OK);

    }


    //to update the credential
    @PutMapping("{username}")
    public ResponseEntity<User> updateUserById(@RequestBody User user, @PathVariable String username){

        User byUserName = userService.findByUserName(username);

        if(byUserName != null){
            byUserName.setPassword(user.getPassword());
            byUserName.setUserName(user.getUserName());
            userService.createUser(byUserName);
            return new ResponseEntity<>(HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);


    }







}
