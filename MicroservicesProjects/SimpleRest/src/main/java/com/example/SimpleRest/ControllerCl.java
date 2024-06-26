package com.example.SimpleRest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerCl {

    @GetMapping("/home")
    public String home(){
        return "Hello world";
    }

    //post method
    @PostMapping("/home")
    public String postData(@RequestBody String data){
        return "This is my posted data" + data + "!";
    }

}
