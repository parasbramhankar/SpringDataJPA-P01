package com.example.SpringDataJPA_P01.service;

import com.example.SpringDataJPA_P01.entity.Student;
import com.example.SpringDataJPA_P01.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public Student saveStudent(Student student){
        return studentRepo.save(student);
    }

    public List<Student>getAllStudentData()
    {
        return studentRepo.findAll();
    }

    public Student getStudentInfoById(Integer id){
        Optional<Student>byId = studentRepo.findById(id);
        return byId.get();
        //return studentRepo.findById(id).orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
    }

    public Student updateStudent(Integer id,Student student){
        Student dbStudent=studentRepo.findById(id).orElseThrow(()->new RuntimeException("Student not found "+id));

        dbStudent.setEmail(student.getEmail());
        dbStudent.setName(student.getName());
        dbStudent.setAge(student.getAge());

        return studentRepo.save(dbStudent);
    }

    public Student updateEmailAndAge(int id, Student student){
        Student dbStudent=studentRepo.findById(id).orElseThrow(()->new RuntimeException("Student not found "+id));

        dbStudent.setEmail(student.getEmail());
        dbStudent.setAge(student.getAge());

        return studentRepo.save(dbStudent);
    }














}
