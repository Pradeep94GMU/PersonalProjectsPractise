package com.pradeep.ToDoApp.Service.ServImp;

import com.pradeep.ToDoApp.Model.TodoApp;
import com.pradeep.ToDoApp.Repo.TodoRepo;
import com.pradeep.ToDoApp.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServImp implements TodoService {

    private TodoRepo todoRepo;

    @Autowired
    public TodoServImp(TodoRepo todoRepo) {
        this.todoRepo = todoRepo;
    }

    @Override
    public void createToDoList(TodoApp todoApp) {
        todoRepo.save(todoApp);

    }

    @Override
    public List<TodoApp> getTodoList() {
        return todoRepo.findAll();
    }
}
