package com.example.jpatest2.studentId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class StudentID implements Serializable  {

    private String studentId;
    private String name;
}
