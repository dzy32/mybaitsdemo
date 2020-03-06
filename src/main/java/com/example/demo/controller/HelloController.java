package com.example.demo.controller;

import com.example.demo.bean.Department;
import com.example.demo.bean.Employee;
import com.example.demo.mapper.DepartmentMapper;
import com.example.demo.mapper.EmployeeMapper;
import com.example.demo.service.EmployeeService;
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

    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/get/{id}")
    public Department getOne(@PathVariable("id") Integer id){
        return departmentMapper.getDepaById(id);
    }

    @PostMapping("/save")
    public Department save(Department department){
        departmentMapper.insert(department);
        return department;
    }
    @GetMapping("/get1/{id}")
    public Employee get1(@PathVariable("id") Integer id){
        return employeeService.findEmpById(id);
    }
    @PostMapping("/save1")
    public Employee save1(Employee employee){
        employeeMapper.insertEmp(employee);
        return employee;
    }
}
