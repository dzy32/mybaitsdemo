package com.example.demo.controller;

import com.example.demo.bean.Department;
import com.example.demo.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author YS
 * @data 2020/2/29 21:49
 */
@RestController("/dept")
public class HelloController {

    @Autowired
    private DepartmentMapper departmentMapper;

    @GetMapping("/get/{id}")
    public Department getOne(@PathVariable("id") Integer id){
        return departmentMapper.getDepaById(id);
    }

    @PostMapping("/save")
    public Department save(Department department){
        departmentMapper.insert(department);
        return department;
    }
}
