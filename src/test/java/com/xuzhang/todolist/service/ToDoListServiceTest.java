package com.xuzhang.todolist.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ToDoListServiceTest {
    @Autowired
    ToDoListService toDoListService;

    @Test
    public void smokeTest() {
        assertNotNull(toDoListService);
    }
}
