package com.atguigu.controller;

import com.atguigu.mapper.StudentMapper;
import com.atguigu.pojo.Student;
import com.atguigu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private StudentService studentService;
    @GetMapping("query")
    public List<Student> query(){
        return studentMapper.queryAll();
    }
    @GetMapping("delete")
    public void delete(){
        studentService.delete();
        System.out.println("studentService = " + studentService);
    }
}
