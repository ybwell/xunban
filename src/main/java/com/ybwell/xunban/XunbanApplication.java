package com.ybwell.xunban;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.ybwell.xunban.model.mapper")
@EnableScheduling
public class XunbanApplication {

    public static void main(String[] args) {
        SpringApplication.run(XunbanApplication.class, args);
    }

}
