package com.wasy.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.wasy.web.mapper"})
public class WasyWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WasyWebApplication.class, args);
    }

}
