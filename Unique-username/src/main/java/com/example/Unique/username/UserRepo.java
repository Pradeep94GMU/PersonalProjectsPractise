package com.example.Unique.username;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<Username, Long> {

    public List<Username> findByNameContainingIgnoreCase(String name);

    @Query("select count(u) from Username u")
    int findTotalUsers();


}
