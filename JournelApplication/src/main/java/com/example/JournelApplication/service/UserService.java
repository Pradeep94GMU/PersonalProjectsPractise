package com.example.JournelApplication.service;

import com.example.JournelApplication.entity.Journel;
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

    public void createJournel(Journel journel){
        journelRepo.save(journel);

    }


    public List<Journel> getAll(){
        return journelRepo.findAll();
    }

    public Optional<Journel> getById(ObjectId id){

        return journelRepo.findById(id);

    }

    public boolean deleteJournelbyId(ObjectId id){

        journelRepo.deleteById(id);
        return true;
    }

    public void updateJournelById(ObjectId id, Journel journel){


    }



}
