package com.kq.mall.manage;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lilei
 */
@SpringBootApplication
@MapperScan(basePackages = "com.kq.mall.manage.mapper")
public class MallManageServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallManageServiceApplication.class,args);
    }
}
