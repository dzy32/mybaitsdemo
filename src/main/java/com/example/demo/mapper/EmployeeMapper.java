package com.example.demo.mapper;

import com.example.demo.bean.Employee;

/**
 * @author YS
 * @data 2020/3/2 19:56
 */
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public int insertEmp(Employee employee);

}
