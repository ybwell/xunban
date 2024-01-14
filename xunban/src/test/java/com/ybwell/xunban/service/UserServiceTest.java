package com.ybwell.xunban.service;

import com.ybwell.xunban.model.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
@Slf4j
public class UserServiceTest {


    @Resource
    private UserService userService;

    @Test
    public void testSearchUsersByTags() {
        List<String> tagNameList = Arrays.asList("java");
        List<User> userList = userService.searchUsersByTags(tagNameList);
        System.out.println(userList);
    }
}
