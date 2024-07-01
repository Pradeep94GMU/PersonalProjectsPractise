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
    private String title;
    private String content;
    private LocalDateTime date;


}
