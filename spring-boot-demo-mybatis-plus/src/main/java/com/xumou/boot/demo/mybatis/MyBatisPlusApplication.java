package com.xumou.boot.demo.mybatis;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan({"com.baomidou.mybatisplus.samples.quickstart.mapper", "com.xumou.boot.demo.mybatis.mapper"})
public class MyBatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisPlusApplication.class, args);
    }

    // 分页插件
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

}
