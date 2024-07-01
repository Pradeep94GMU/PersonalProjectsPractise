package com.example.JournelApplication.repo;

import com.example.JournelApplication.entity.Journel;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JournelRepo extends MongoRepository<Journel, ObjectId> {
}
