package com.dawn.crowd.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CrowdTest {
    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void testSaveValueToRedisByRedisTemplate(){
        ValueOperations<Object, Object> objectObjectValueOperations = redisTemplate.opsForValue();//获取redis操作器
        //objectObjectValueOperations.set("keyone","valueone");//存值
        Object value = objectObjectValueOperations.get("keyone");
        System.out.println(value);
    }

    @Test
    public void testSaveAndGetValueToRedisByStringRedisTemplate() {

        // 获取Redis操作器
        ValueOperations<String, String> operator = stringRedisTemplate.opsForValue();

        // 设置值
        // operator.set("keytwo", "valuetwo");

        // 获取值
        String value = operator.get("keytwo");
        System.out.println(value);
    }
}
