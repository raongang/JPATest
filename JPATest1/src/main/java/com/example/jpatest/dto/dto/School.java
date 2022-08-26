package com.example.jpatest.dto.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="school")
// Serializable을 상속받지 않으면 Entity가 여러개일 때 에러 발생 - 복합키
public class School implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="school_id")
    int id;

    private String name;
    private String region;
    private int ranking;

    // 1:n 단방향 관계
    //@OneToMany(fetch = FetchType.EAGER) //즉시로딩
//    @OneToMany
//    @JoinColumn(name="school_id")
//    private List<Student> students;



}





