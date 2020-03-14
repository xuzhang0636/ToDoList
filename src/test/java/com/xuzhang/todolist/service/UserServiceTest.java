package com.xuzhang.todolist.service;

import com.xuzhang.todolist.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
public class UserServiceTest {
    @Autowired
    UserService userService;

    @Test
    public void smokeTest() {
        assertNotNull(userService);
    }

    @Test
    public void insertUserTest() {
        User user = User.builder().username("xuzhang").phone("+8613474012427").gender(0).password("robert").build();
        userService.insertUser(user);
    }
}
