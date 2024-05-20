package com.gameproject.guessGame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class GuessController {

  @GetMapping("/api/home")
    public String home(){
      return "hello home";
    }

}
