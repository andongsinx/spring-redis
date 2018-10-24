package com.andong.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description
 * @create by shadow
 * @date 2018/10/24
 * @since 1.0
 */
@SpringBootApplication(scanBasePackages = "com.andong.application")
public class BootStrap {


    public static void main(String[] args) {
        SpringApplication.run(BootStrap.class,args);
    }




}
