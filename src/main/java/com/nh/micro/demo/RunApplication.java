package com.nh.micro.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.nh.micro.demo.dao")
public class RunApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(RunApplication.class, args);
    }
}