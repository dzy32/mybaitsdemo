package com.example.demo.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author YS
 * @data 2020/2/29 21:06
 */

@Data
public class Department implements Serializable {
    private Integer id;
    private String departmentName;

}
