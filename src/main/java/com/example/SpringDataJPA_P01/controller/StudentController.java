package com.example.SpringDataJPA_P01.controller;

import com.example.SpringDataJPA_P01.entity.Student;
import com.example.SpringDataJPA_P01.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/std")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/save")
    public Student createStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }


}
