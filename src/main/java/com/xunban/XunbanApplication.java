package com.xunban;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xunban.mapper")
public class XunbanApplication {

    public static void main(String[] args) {
        SpringApplication.run(XunbanApplication.class, args);
    }

}
