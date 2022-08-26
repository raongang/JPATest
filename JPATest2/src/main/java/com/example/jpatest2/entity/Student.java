package com.example.jpatest2.entity;

import com.example.jpatest2.studentId.StudentID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import javax.sql.rowset.serial.SerialArray;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="student")
@IdClass(StudentId.class)
public class Student implements Serializable {

    @Id
    @Column(name="student_id")
    private String studentId;

    @Id
    private String name;

    @ManyToOne (cascade = CascadeType.MERGE)//다대일 관계
    @JoinColumn(name="school_id")  // name의 school_id = school테이블을 매핑하는 엔티티의 변수명이 id인것에 매핑, 연관관계 주인인 엔티티
    @NotFound(action= NotFoundAction.IGNORE)
    private School school;

    private int score;

}
