package com.shannon.sun.demo01.application;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author xibin sun
 */
@Slf4j
@EnableCaching
@SpringBootApplication(scanBasePackages = {"com.shannon.sun.demo01"})
@MapperScan({"com.shannon.sun.demo01.dal.mapper"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
