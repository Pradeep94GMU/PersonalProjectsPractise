package com.example.JournelApplication.service;

import com.example.JournelApplication.entity.Journel;
import com.example.JournelApplication.entity.User;
import com.example.JournelApplication.repo.JournelRepo;
import com.example.JournelApplication.repo.UserRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public void createUser(User user){
        userRepo.save(user);

    }


    public List<User> getAll(){
        return userRepo.findAll();
    }

    public Optional<User> getById(ObjectId id){

        return userRepo.findById(id);

    }

    public boolean deleteUserby(ObjectId id){

        userRepo.deleteById(id);
        return true;
    }

    public void updateUserById(ObjectId id, User user){

        userRepo.save(user);


    }

    public User findByUserName(String username){
        return userRepo.findByUserName(username);
    }



}
