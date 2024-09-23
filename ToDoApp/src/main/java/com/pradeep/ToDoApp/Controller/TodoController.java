package com.pradeep.ToDoApp.Controller;

import com.pradeep.ToDoApp.Model.TodoApp;
import com.pradeep.ToDoApp.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todo")
public class TodoController {

    private final TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    public void createToDoList(@RequestBody TodoApp todoApp){
        todoService.createToDoList(todoApp);
    }

    @GetMapping
    public List<TodoApp> getTodoList(){
        return todoService.getTodoList();
    }

}
