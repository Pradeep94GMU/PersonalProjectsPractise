package com.example.JournelApplication.controller;

import com.example.JournelApplication.entity.Journel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/journel")
public class JournelController {

    HashMap<Long, Journel> map = new HashMap<Long, Journel>();

    @GetMapping
    public List<Journel> getAll(){
        return new ArrayList<>(map.values());
    }


    @PostMapping
    public String createJournel(@RequestBody Journel journel){

        map.put(journel.getId(), new Journel(journel.getId(), journel.getTitle(), journel.getContent()));

        return "Added one new Jounrel";
    }

    @GetMapping("/{id}")
    public Journel getJournelById(@PathVariable Long id){
        return map.get(id);
    }

    @DeleteMapping("/{id}")
    public boolean deleteEntryById(@PathVariable Long id){
        if(!map.containsKey(id)){
            System.out.println("ID not exist...");
            return false;
        }
        map.remove(id);
        return true;
    }

    @PutMapping("/{id}")
    public Journel updateJournelByID(@PathVariable Long id, @RequestBody Journel journel){
        if(id.equals(journel.getId())){
            return  map.put(id, journel);
        }
        else{
            System.out.println("Wrong ID");
            return null;
        }

    }

}
