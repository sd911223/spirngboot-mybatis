package com.shidun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.shidun.dao")
//@EnableDiscoveryClient
public class SpirngBootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpirngBootMybatisApplication.class, args);
    }

}
