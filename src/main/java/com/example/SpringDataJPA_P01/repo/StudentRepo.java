package com.example.SpringDataJPA_P01.repo;

import com.example.SpringDataJPA_P01.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
}
