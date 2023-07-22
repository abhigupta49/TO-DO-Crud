package com.Abhishek.todo.app.service;

import com.Abhishek.todo.app.model.todoModel;
import com.Abhishek.todo.app.repository.todoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class todoService {

    @Autowired
    todoRepo todorepo;

    public String addTodo(todoModel todo) {
        todorepo.addTodo(todo);
        return "todo added successfully";
    }


    public String deleteTodoById(Integer todoId) {

        for(todoModel todo : todorepo.getAllTodos()){
            if(todo.getTodoId().equals(todoId)){
                todorepo.deleteTodo(todo);
                return "todo" + todoId + "deleted successfully";
            }
        }
        return "todo with todoId" + todoId + "not found";
    }


    public todoModel getTodoById(Integer todoId) {
        for(todoModel todo : todorepo.getAllTodos()){
            if(todo.getTodoId().equals(todoId)){
                return todo;
            }
        }
        throw new IllegalStateException("id not found");
    }


    public List<todoModel> getAllTodos() {
        return todorepo.getAllTodos();
    }


    public List<todoModel> getAllDoneTodos() {
        List<todoModel> DoneTodos=new ArrayList<>();
        for(todoModel todo : todorepo.getAllTodos()){
            if(todo.getTodoDoneStatus()){
                DoneTodos.add(todo);
            }
        }
        return DoneTodos;
    }

    public List<todoModel> getAllUndoneTodos() {
        List<todoModel> UndoneTodos=new ArrayList<>();
        for(todoModel todo : todorepo.getAllTodos()){
            if(!todo.getTodoDoneStatus()){
                UndoneTodos.add(todo);
            }
        }
        return UndoneTodos;
    }


    public String updateTodoByStatusById(boolean status, Integer id) {
        for(todoModel todo : todorepo.getAllTodos()){
            if(todo.getTodoId().equals(id)){
                todo.setTodoDoneStatus(status);
                return "todo Id" + id + "updated successfully";
            }
        }
        return "todo Id" + id + "not found";
    }
}
