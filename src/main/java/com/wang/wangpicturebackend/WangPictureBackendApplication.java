package com.wang.wangpicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wang.wangpicturebackend.mapper")
public class WangPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(WangPictureBackendApplication.class, args);
    }

}
