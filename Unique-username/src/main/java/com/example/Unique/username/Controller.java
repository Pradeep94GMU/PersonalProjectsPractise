package com.example.Unique.username;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:5174")
public class Controller {

    private final UserService userService;

    @Autowired
    public Controller(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/totalUsers")
    public int totalUsers(){
        return userService.findtotalusers();
    }


    @GetMapping("/search")
    public ResponseEntity<List<Username>> getUsername(@RequestParam String name){


        List<Username> res = userService.findUsername(name);

        if(res != null){
            return new ResponseEntity<>(res, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @PostMapping("/createUsername")
    public ResponseEntity<?> createUsernames(@RequestBody Map<String, Integer> request){
        System.out.println(request);
        int count = request.get("count");
        int createdCount = userService.createUsernames(count);

        return ResponseEntity.ok(Map.of("created", createdCount));

    }

}
