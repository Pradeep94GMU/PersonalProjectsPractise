package com.security.secuity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

    @GetMapping("/public")
    public String getRolePublic(){
        return "Hello world, I am public";
    }

    @GetMapping("/authUser")
    public String getRoleAuthUser(){
        return "Hello world, I am auth User";
    }

    @GetMapping("/admin")
    public String getRoleAdmin(){
        return "Hello world, I am admin";
    }



}
