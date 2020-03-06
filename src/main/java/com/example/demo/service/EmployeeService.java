package com.example.demo.service;

import com.example.demo.bean.Employee;
import com.example.demo.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author YS
 * @data 2020/3/4 15:17
 */
@CacheConfig(cacheNames = "emp")
@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;



    @Cacheable(key = "#id")
    public Employee findEmpById(Integer id){
        Employee employee = employeeMapper.getEmpById(id);
//        redisTemplatel.opsForValue().set("id");
        return employee;
    }
}
