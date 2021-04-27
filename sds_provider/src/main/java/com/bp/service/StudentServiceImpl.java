package com.bp.service;

import com.bp.api.StudentService;
import com.bp.entry.Student;
import com.bp.mapper.StudentMapper;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

@DubboService(version = "1.0.0", protocol = "dubbo")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student getStudentById(Integer id) {
        if (id == 1) {
            throw new RuntimeException("id:" + id + ",getStudentById is error!");
        }
        Student student1 = studentMapper.getById(id);
        return student1;
    }

    @Override
    public int insert(Student student) {
        Integer insert = studentMapper.insert(student);
        return insert;
    }
}
