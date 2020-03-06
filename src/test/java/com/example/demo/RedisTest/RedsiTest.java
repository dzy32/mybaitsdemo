package com.example.demo.RedisTest;

import com.example.demo.bean.Employee;
import com.example.demo.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author YS
 * @data 2020/3/4 14:44
 */


@SpringBootTest
public class RedsiTest {

    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private EmployeeMapper employeeMapper;
    @Test
    public void Test01(){
        Employee employee = employeeMapper.getEmpById(1);
        redisTemplate.opsForValue().set("emp1",employee);

    }
}
