package com.example.jpatest2.repository;

import com.example.jpatest2.entity.Student;
import com.example.jpatest2.studentId.StudentID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, StudentID> {
}
