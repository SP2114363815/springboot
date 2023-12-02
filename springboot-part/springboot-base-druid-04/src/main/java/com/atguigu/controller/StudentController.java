package com.atguigu.controller;

import com.atguigu.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @RequestMapping("list")
    public List<Student> list(){
        String sql="select*from student;";
        List<Student> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));
        return query;
    }
}
