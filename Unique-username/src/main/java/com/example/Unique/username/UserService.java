package com.example.Unique.username;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public void createUsernames();

    public List<Username> findUsername(String name);
}
