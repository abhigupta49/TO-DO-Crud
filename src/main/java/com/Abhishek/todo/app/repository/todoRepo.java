package com.Abhishek.todo.app.repository;

import com.Abhishek.todo.app.model.todoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class todoRepo {
    @Autowired
    public List<todoModel> myTodos;

    public List<todoModel> getAllTodos(){
        return myTodos;
    };

    public void addTodo(todoModel todo){
        myTodos.add(todo);
    }

    public void deleteTodo(todoModel todo){
        myTodos.remove(todo);
    }

}
