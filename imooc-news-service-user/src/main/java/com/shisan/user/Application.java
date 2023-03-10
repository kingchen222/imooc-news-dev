package com.shisan.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author ShiSan
 * @version 1.0
 * @date 2023/3/7 20:50
 */
@SpringBootApplication
@MapperScan(basePackages = "com.shisan.user.mapper")
@ComponentScan("com.shisan")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
