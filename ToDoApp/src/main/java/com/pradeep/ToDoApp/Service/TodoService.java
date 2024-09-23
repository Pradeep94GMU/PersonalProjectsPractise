package com.pradeep.ToDoApp.Service;

import com.pradeep.ToDoApp.Model.TodoApp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoService {

    void createToDoList(TodoApp todoApp);

    List<TodoApp> getTodoList();

}
