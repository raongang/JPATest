package com.example.jpatest.repository;
import com.example.jpatest.dto.dto.Student;
import com.example.jpatest.dto.dto.StudentID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, StudentID> {
}
