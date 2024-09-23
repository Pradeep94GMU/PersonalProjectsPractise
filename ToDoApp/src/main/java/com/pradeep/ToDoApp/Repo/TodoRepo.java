package com.pradeep.ToDoApp.Repo;

import com.pradeep.ToDoApp.Model.TodoApp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepo extends JpaRepository<TodoApp, Integer> {
}
