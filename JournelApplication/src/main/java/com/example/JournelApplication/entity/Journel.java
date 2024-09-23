package com.example.JournelApplication.entity;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Document
public class Journel {
    @Id
    private ObjectId id;
    @NonNull
    private String title;
    private String content;
    private LocalDateTime date;

    public Journel() {
        // Default constructor
    }

    public Journel(ObjectId id, String title, String content, LocalDateTime date) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.date = date;
    }
}
