package com.example.SpringDataJPA_P01.repo;

import com.example.SpringDataJPA_P01.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
    /*
    JpaRepository this is a marker interface, JVM is responsible to give its functionality
    Responsibility is that to give the implementation of the StudentRepo interface internally,

    Implementation: All the methods that are communicate with the database,that all come inside the
    StudentRepo interface internally, and all this happened automatically.

    Example: save() : use to save the data into the db,  ( use into the Service class)
             public Student saveStudent(Student student){
                 return studentRepo.save(student);
             }
     <Student, Integer>(<T,Id>): here the T represents on which class you are applying this JpaRepository
       Id: represent type of the primary key into the entity class

     */
}
