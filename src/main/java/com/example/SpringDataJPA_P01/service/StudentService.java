package com.example.SpringDataJPA_P01.service;

import com.example.SpringDataJPA_P01.entity.Student;
import com.example.SpringDataJPA_P01.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public Student saveStudent(Student student){
        return studentRepo.save(student);
    }



}
