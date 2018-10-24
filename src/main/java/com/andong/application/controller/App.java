package com.andong.application.controller;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 */
@RestController
public class App {


    @Autowired
    StringRedisTemplate redisTemplate;

    @RequestMapping("hello")

    public String hello() {
        redisTemplate.opsForValue().set("k1","v1");

        return "success";
    }


}
