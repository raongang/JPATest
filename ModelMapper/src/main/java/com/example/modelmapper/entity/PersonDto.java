package com.example.modelmapper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonDto {

    private int id;
    private String name;

    // person클래스의 team이라는 이름 의 객체에 id라는 변수호자ㅐ
    private int teamId;
}
