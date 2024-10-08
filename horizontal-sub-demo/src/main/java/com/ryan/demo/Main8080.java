package com.ryan.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author kq
 * 2024-09-18 14:27
 **/
@MapperScan("com.ryan.demo.mapper")
@SpringBootApplication
public class Main8080 {

    public static void main(String[] args) {
        SpringApplication.run(Main8080.class, args);
    }

}
