package com.example.demo.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author YS
 * @data 2020/2/29 21:05
 */
@Data
public class Employee implements Serializable {
    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;
    private Integer dId;


}
