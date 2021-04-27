package com.bp.web;

import com.bp.api.StudentService;
import com.bp.entry.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.apache.dubbo.config.annotation.DubboReference;

@Component
@RestController
@RequestMapping("/api")
public class StudentController {
    @DubboReference(version = "1.0.0", protocol = "dubbo", check = false)
    private StudentService studentService;

    @GetMapping("/getStudent")
    public Student getStudent() {
        System.out.println("=====>sssssss");
        return studentService.getStudentById(1);
    }
    @GetMapping("/getStudentById")
    public Student getStudentById(@RequestParam Integer id) {
        System.out.println("=====>getStudentById");
        return studentService.getStudentById(id);
    }

    @PostMapping("/insert")
    public Integer insert(@RequestBody Student student) {
        System.out.println("=====>insert ");
        return studentService.insert(student);
    }

}
