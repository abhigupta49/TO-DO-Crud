package com.Abhishek.todo.app.controller;

import com.Abhishek.todo.app.model.todoModel;
import com.Abhishek.todo.app.service.todoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class todoController {

    @Autowired
    todoService todoservice;

    @PostMapping("Todo")
    public String addTodo(@RequestBody todoModel todo){
        return todoservice.addTodo(todo);
    }

    @DeleteMapping("Todo/{todoId}")
    public String deleteTodoById(@PathVariable Integer todoId){
        return todoservice.deleteTodoById(todoId);
    }

    @GetMapping("Todo/{todoId}")
    public todoModel getTodoById(@PathVariable Integer todoId){
        return todoservice.getTodoById(todoId);
    }

    @GetMapping("Todos")
    public List<todoModel> getAllTodos(){
        return todoservice.getAllTodos();
    }

    @GetMapping("Todos/done")
    public List<todoModel> getAllDoneTodos(){
        return todoservice.getAllDoneTodos();
    }

    @GetMapping("Todos/undone")
    public List<todoModel> getAllUndoneTodos(){
        return todoservice.getAllUndoneTodos();
    }

    @PutMapping("todo/{status}/{Id}")
    public String updateTodoByStatusById(@PathVariable boolean status,@PathVariable Integer Id){
        return todoservice.updateTodoByStatusById(status,Id);
    }

}
