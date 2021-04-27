package com.bp.api;

import com.bp.entry.Student;

public interface StudentService {
    Student getStudentById(Integer id);
    int insert(Student student);
}
