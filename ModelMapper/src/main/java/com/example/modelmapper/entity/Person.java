package com.example.modelmapper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="person")
public class Person {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;


    // Team객체에 들어있는 id라는 이름의 변수가 personDto 클래스의 teamId로 매핑된다.
    @ManyToOne
    @JoinColumn(name="team_id")
    private Team team;

}
