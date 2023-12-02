package com.atguigu.service;

import com.atguigu.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Transactional
    public void delete(){
        int rows=studentMapper.delete(1);
        System.out.println("rows = " + rows);

    }
}
