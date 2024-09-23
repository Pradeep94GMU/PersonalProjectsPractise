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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/journel")
public class JournelControllerV2 {

    @Autowired
    private JournelService journelService;


    @Autowired
    private UserService userService;


    //users will get their respected journel

    @GetMapping("/user/{username}")
    public ResponseEntity<List<Journel>> getJournelAll(@PathVariable String username) {

        System.out.println("This is for each Username....");
        //now to get a particular user , i need user service
        User user = userService.findByUserName(username);
        if(user == null){
            return new ResponseEntity<>( HttpStatus.NO_CONTENT);
        }
        //now i am not giving jus detail of list of journel but i need to give for user list of journel
        List<Journel> listOfUserJournel = user.getJournelList();
        if(listOfUserJournel != null || !listOfUserJournel.isEmpty()){
            return new ResponseEntity<>(listOfUserJournel, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

    }

    @GetMapping
    public ResponseEntity<List<Journel>> getJournelListAll() {
        //now to get a perticular user , i need user service


        System.out.println("This is for all Journel ....");

        //now i am not giving jus detail of list of journel but i need to give for user list of journel
        List<Journel> listOfJournel = journelService.getAll();
        if(listOfJournel != null || !listOfJournel.isEmpty()){
            return new ResponseEntity<>(listOfJournel, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    @PostMapping("/{username}")
    public ResponseEntity<Journel> createJournelForUser(@PathVariable String username, @RequestBody Journel journel) {

       try{

           System.out.println("Inside the create Journel...");
           //save the journel document into journel as well as user
           LocalDateTime now = LocalDateTime.now();
           journel.setDate(now);
           journelService.createJournel(journel, username);
           return new ResponseEntity<>(journel, HttpStatus.CREATED);
       }catch(Exception e){
           return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
       }


    }

    @GetMapping("/{id}")
    public ResponseEntity<Journel> getJournelById(@PathVariable ObjectId id) {
        Optional<Journel> journeyEntry = journelService.getById(id);

        if(journeyEntry.isPresent()){
            //not null, we have some entry of journel
            return new ResponseEntity<>(journeyEntry.get(), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Optional<Journel>> deleteEntryById(@PathVariable ObjectId id) {
        boolean deleted = journelService.deleteJournelbyId(id);
        Optional<Journel> OldData = journelService.getById(id);
        if(deleted){
            return new ResponseEntity<>(OldData, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

//    @PutMapping("/{id}")
//    public ResponseEntity<Journel> updateJournelByID(@PathVariable ObjectId id, @RequestBody Journel newjournel) {
//        //we are getting id
//        //we need to find that id
//        Journel old = journelService.getById(id).orElse(null);
//
//        if(old != null){
//            old.setContent(newjournel.getContent() != null && !newjournel.getContent().equals("") ? newjournel.getContent(): old.getContent());
//            old.setTitle(newjournel.getTitle() != null && !newjournel.getTitle().equals("") ? newjournel.getTitle() : old.getTitle());
//            journelService.createJournel(old);
//            return new ResponseEntity<>(old, HttpStatus.OK);
//
//        }
//        else{
//            //not in db to updaate
//            return new ResponseEntity<>( HttpStatus.NOT_FOUND);
//        }



    //}





}
