package com.example.SpringDataJPA_P01.controller;

import com.example.SpringDataJPA_P01.entity.Student;
import com.example.SpringDataJPA_P01.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/std")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/save")
    public Student createStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @GetMapping("/all")
    public List<Student>getAllStudent(){
        return studentService.getAllStudentData();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Integer id){
        return studentService.getStudentInfoById(id);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Integer id, @RequestBody Student student){
        return studentService.updateStudent(id,student);
    }



}
