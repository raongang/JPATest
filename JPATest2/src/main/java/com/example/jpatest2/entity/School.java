package com.example.jpatest2.entity;

import lombok.*;

import javax.annotation.security.DenyAll;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

//@Data

@Setter
@Getter
@ToString(exclude = {"students"})

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="school")
public class School implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="school_id")
    int id;

    private String name;
    private String region;
    private int ranking;

    // 연관관계 주인이 아닌 엔티티, mappedBy에 연관관계 주인이 참조하는 변수명 등록
    @OneToMany(mappedBy = "school")
    private List<Student> students;

    void add(Student student){
        student.setSchool(this);
      getStudents().add(student);
    }


}
