package com.example.demo.mapper;

import com.example.demo.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * @author YS
 * @data 2020/2/29 21:10
 */
@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    public Department getDepaById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteDepaById(Integer id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into department(departmentName) values(#{departmentName})")
    public int insert(Department department);

    @Update("update from department set departmentName=#{departmentName} where id=#{id}")
    public int update(Department department);
}
