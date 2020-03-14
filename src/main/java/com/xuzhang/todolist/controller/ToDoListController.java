package com.xuzhang.todolist.controller;

import com.xuzhang.todolist.model.ToDoList;
import com.xuzhang.todolist.model.User;
import com.xuzhang.todolist.service.ToDoListService;
import com.xuzhang.todolist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ToDoListController {
    @Autowired
    ToDoListService toDoListService;

    @Autowired
    UserService userService;

    @GetMapping
    public List<ToDoList> getAllToDoListByUser(User user) {
        return null;
    }
}
