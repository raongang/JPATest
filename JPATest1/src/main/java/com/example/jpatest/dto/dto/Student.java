package com.example.jpatest.dto.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Optional;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="student")
@IdClass(StudentID.class)
public class Student implements Serializable {

    @Id
    @Column(name="student_id")
    private String studentId;
    @Id
    private String name;

//    private int school_id;
//    private int score;

    @ManyToOne // N:1 단방향관계 ( outer join )
    //@ManyToOne(optional =false) // inner join
    @NotFound(action= NotFoundAction.IGNORE) //값이 발견되지 않으면 무시
    @JoinColumn(name="school_id")
    private School school;
    private int score;
}
