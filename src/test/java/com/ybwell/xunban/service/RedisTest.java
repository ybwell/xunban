package com.ybwell.xunban.service;
import java.util.Date;

import com.ybwell.xunban.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;

/**
 * Redis 测试
 *
 */
@SpringBootTest
public class RedisTest {

    @Resource
    private RedisTemplate redisTemplate;

    @Test
    void test() {
        ValueOperations valueOperations = redisTemplate.opsForValue();
        // 增
        valueOperations.set("yb1", "hello1");
        valueOperations.set("yb2", "hello2");
        valueOperations.set("yb3", "hello3");

        User user = new User();
        user.setId(0L);
        user.setUsername("yb4");
        user.setUserAccount("hello4");

        Object yy = valueOperations.get("yb1");
        Assertions.assertTrue("hello1".equals((String)yy));
    }
}
