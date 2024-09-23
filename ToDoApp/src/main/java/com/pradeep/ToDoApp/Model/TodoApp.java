package com.pradeep.ToDoApp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class TodoApp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;

    @Override
    public String toString() {
        return "TodoApp{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
