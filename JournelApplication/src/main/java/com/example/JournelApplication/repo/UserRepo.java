package com.example.JournelApplication.repo;

import com.example.JournelApplication.entity.Journel;
import com.example.JournelApplication.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<User, ObjectId> {
    public User findByUserName(String userName);
}
