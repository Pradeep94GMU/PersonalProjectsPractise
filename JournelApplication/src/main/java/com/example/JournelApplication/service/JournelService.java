package com.example.JournelApplication.service;

import com.example.JournelApplication.entity.Journel;
import com.example.JournelApplication.entity.User;
import com.example.JournelApplication.repo.JournelRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JournelService {

    @Autowired
    private JournelRepo journelRepo;

    @Autowired
    private UserService userService;

    public void createJournel(Journel journel, String username) {

        System.out.println("Inside the create Journel...");

        User user = userService.findByUserName(username);

        Journel savedEntry = journelRepo.save(journel);

        //now we have our entry here, so we caan use this journel entry and use it in our user entry
        user.getJournelList().add(savedEntry);
        //now we save int ArrayList(in-memory) but we have to save this user detail into db as well
        userService.createUser(user);


    }


    public List<Journel> getAll() {
        return journelRepo.findAll();
    }

    public Optional<Journel> getById(ObjectId id) {

        return journelRepo.findById(id);

    }

    public boolean deleteJournelbyId(ObjectId id) {

        journelRepo.deleteById(id);
        return true;
    }

    public void updateJournelById(ObjectId id, Journel journel) {

        journelRepo.save(journel);


    }


}
