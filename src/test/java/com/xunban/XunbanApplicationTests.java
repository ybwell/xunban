package com.xunban;

import com.xunban.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class XunbanApplicationTests {


    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        List<String> list = new ArrayList<>();
        list.add("401");
        list.add("hi");
        list.add("nothing");
        userService.searchUsersByTagsBySQL(list);
    }
}

