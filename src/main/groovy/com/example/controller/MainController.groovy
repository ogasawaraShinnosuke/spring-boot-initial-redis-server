package com.example.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.redis.core.RedisTemplate
import org.springframework.data.redis.core.StringRedisTemplate
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping('/')
class MainController {

    @RequestMapping
    def helloWorld() {
        "hello, world"
    }

    @Autowired
    // binary
//    RedisTemplate redisTemplate
    StringRedisTemplate stringRedisTemplate

    def DUMMYKEY = 'spring:test'

    /**
     * @param keyName user:{user_id}
     * @param objectName user's json object name
     * @return json
     */
    @RequestMapping('{keyName}/{objectName}')
    @ResponseBody
    def index(@PathVariable String keyName, @PathVariable String objectName) {
        def ops = stringRedisTemplate.opsForHash()
        if (stringRedisTemplate.hasKey(keyName)) {
            ops.get(keyName, objectName)
        } else {
            println "error, keyName=$keyName, objectName=$objectName"
        }
    }
}
