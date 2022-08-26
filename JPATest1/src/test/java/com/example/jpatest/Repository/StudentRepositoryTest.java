package com.example.jpatest.Repository;
import com.example.jpatest.dto.dto.StudentID;
import com.example.jpatest.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    @Test
    public void

    studentTest(){
        System.out.println(studentRepository.findAll().toString());
    }

    // left outer join
    @Test
    public void studentTest2() {
        System.out.println(studentRepository.findById(new StudentID("0000", "유가네")).toString());
    }


}
