package com.atguigu.mapper;

import com.atguigu.pojo.Student;

import java.util.List;

public interface StudentMapper {
    List<Student> queryAll();

    int delete(int i);
}
