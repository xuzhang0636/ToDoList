package com.xuzhang.todolist.controller;

import com.xuzhang.todolist.model.ToDoList;
import com.xuzhang.todolist.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
public class ToDoListControllerTest {
    @Autowired
    ToDoListController toDoListController;

    @Test
    public void smokeTest() {
        assertNotNull(toDoListController);
    }

    @Test
    public void getAllToDoListTest() {
        User user = User.builder().build();
        List<ToDoList> allToDoListByUser = toDoListController.getAllToDoListByUser(user);
        assertNotNull(allToDoListByUser);
    }
}
