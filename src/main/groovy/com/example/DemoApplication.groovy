package com.example

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.data.redis.core.RedisTemplate
import org.springframework.data.redis.core.ValueOperations

@SpringBootApplication
class DemoApplication implements CommandLineRunner {

//    @Autowired
//    RedisTemplate redisTemplate

    static void main(String[] args) {
        SpringApplication.run DemoApplication, args
    }

    @Override
    void run(String... args) throws Exception {
//        def ops = redisTemplate.opsForValue()
//        def key = 'spring.boot.redis.test'
//        if (!redisTemplate.hasKey(key)) {
//            ops.set(key, 'foo')
//        }
//        println "key=$key, value=${ops.get key}"
    }
}
