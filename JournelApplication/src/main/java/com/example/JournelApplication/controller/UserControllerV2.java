package com.example.JournelApplication.controller;

import com.example.JournelApplication.entity.Journel;
import com.example.JournelApplication.service.JournelService;
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


    @GetMapping
    public ResponseEntity<List<Journel>> getAll() {
        List<Journel> listOfJournel = journelService.getAll();
        return new ResponseEntity<>(listOfJournel, HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Journel> createJournel(@RequestBody Journel journel) {

        LocalDateTime now = LocalDateTime.now();
        journel.setDate(now);
        journelService.createJournel(journel);

        return new ResponseEntity<>(journel, HttpStatus.BAD_REQUEST);
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

    @PutMapping("/{id}")
    public ResponseEntity<Journel> updateJournelByID(@PathVariable ObjectId id, @RequestBody Journel newjournel) {
        //we are getting id
        //we need to find that id
        Journel old = journelService.getById(id).orElse(null);

        if(old != null){
            old.setContent(newjournel.getContent() != null && !newjournel.getContent().equals("") ? newjournel.getContent(): old.getContent());
            old.setTitle(newjournel.getTitle() != null && !newjournel.getTitle().equals("") ? newjournel.getTitle() : old.getTitle());
            journelService.createJournel(old);
            return new ResponseEntity<>(old, HttpStatus.OK);

        }
        else{
            //not in db to updaate
            return new ResponseEntity<>( HttpStatus.NOT_FOUND);
        }



    }





}
