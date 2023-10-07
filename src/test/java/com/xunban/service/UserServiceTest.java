package com.xunban.service;

import com.xunban.pojo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void testSearchUsersByTags() {
        List<String> tagsNameList = Arrays.asList("java", "python");
        List<User> userList = userService.searchUsersByTagsBySQL(tagsNameList);
        System.out.println(userList);
    }

}
