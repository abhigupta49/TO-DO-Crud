package com.Abhishek.todo.app;

import com.Abhishek.todo.app.model.todoModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
@Configuration
public class beanFactory {
    @Bean
    public List<todoModel> getDataSource(){
        return new ArrayList<>();
    }
}
