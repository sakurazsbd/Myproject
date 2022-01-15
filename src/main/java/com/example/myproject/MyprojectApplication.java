package com.example.myproject;

import com.example.myproject.config.TestConfigBean;
import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties({TestConfigBean.class})
@SpringBootApplication
@MapperScan("com.example.myproject.mapper")
@EnableKnife4j
public class MyprojectApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyprojectApplication.class, args);
    }
    
}
