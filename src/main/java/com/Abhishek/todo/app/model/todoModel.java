package com.Abhishek.todo.app.model;

public class todoModel {
    public Integer todoId;

    public String todoName;

    public boolean todoDoneStatus;

    public Integer getTodoId(){
        return todoId;
    }

    public String getTodoName(){
        return todoName;
    }

    public boolean getTodoDoneStatus(){
        return todoDoneStatus;
    }

    public void setTodoId(Integer todoId){
        this.todoId=todoId;
    }

    public void setTodoName(String todoName){
        this.todoName=todoName;
    }

    public void setTodoDoneStatus(boolean todoDoneStatus){
        this.todoDoneStatus=todoDoneStatus;
    }

}
