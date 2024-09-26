package com.example.Unique.username;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public int createUsernames(int count);

    public List<Username> findUsername(String name);


    int findtotalusers();
}
