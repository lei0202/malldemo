package com.kq.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lilei
 */
@SpringBootApplication
@MapperScan("com.kq.mall.mapper")
public class MallUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallUserApplication.class,args);
    }
}
