package com.example.modelmapper;

import com.example.modelmapper.entity.Person;
import com.example.modelmapper.entity.PersonDto;
import com.example.modelmapper.entity.Team;
import com.example.modelmapper.entity.TeamDto;
import com.example.modelmapper.repository.PersonRepository;
import com.example.modelmapper.repository.TeamRepository;
import jdk.nashorn.internal.runtime.logging.Logger;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *  ModelMapper는 엔티티와 DTO 간에 변환할 때 자동으로 매핑시켜주는 라이브러리입니다.
 *  매핑해줄 클래스에는 setter가 있어야 하고 매핑이 되는 클래스에서 getter가 있어야 사용 가능합니다.
 *  기본적으로 ModelMapper에서 제공해주는 map메서드를 이용하여 변환할 수 있고 클래스 내부에 있는 변수들의 이름을 분석하여 자동 매핑시켜주는 방식입니다.
 */
@SpringBootTest
class ModelMapperApplicationTests {

    /*
    Team과 Person 중 연관관계가 없는 것은 Team에 해당되겠습니다.
    연관관계가 없는 경우는 클래스 내부에 자료형 변수밖에 없기 때문에 변수 이름을 동일하게만 해주면 됩니다.
    현재 Team과 TeamDto는 변수명이 모두 동일하기 때문에 다음과 같이 ModelMapper를 이용하여 매핑을 해줄 수 있습니다.
    */

    @Autowired
    TeamRepository teamRepository;

    @Autowired
    PersonRepository personRepository;

    @Autowired
    ModelMapper modelMapper;

    //단일 검색
    @Test
    public void modelMapper() {
        Team team = teamRepository.findById(1).get(); //entity
        TeamDto teamDto = modelMapper.map(team, TeamDto.class);
        System.out.println(teamDto.toString());

        Team nextTeam = modelMapper.map(teamDto, Team.class);
        System.out.println(nextTeam.toString());
    }

    //다중 검색.
    @Test
    public void modelMapper2() {
        List<Team> teamList = teamRepository.findAll();
        List<TeamDto> teamDtoList = teamList.stream().map(team -> modelMapper.map(team, TeamDto.class)).collect(Collectors.toList());
        System.out.println(teamDtoList.toString()); //dto 출력.

        List<Team> nextTeamList = teamDtoList.stream().map(teamDto -> modelMapper.map(teamDto, Team.class)).collect(Collectors.toList());
        System.out.println(nextTeamList.toString()); //entity 출력
    }


    /*
        연관관계가 있는 경우.
        Person클래스는 team_id라는 외래 키를 가지고 연관관계 매핑이 되어 있습니다.
        이런 경우에는 PersonDto클래스의 teamId값이 Person클래스의 team이라는 이름의 객체에 id라는 이름의 변수 값으로 매핑이 됩니다.
        반대로 Person클래스의 team객체에 들어있는 id라는 이름의 변수가 PersonDto클래스의 teamId라는 이름의 변수값으로 매핑이 됩니다.
        결론적으로 코드 자체는 변수 이름만 잘 매핑이 되어있다면 방법 1과 동일하게 됩니다.
     */

    @Test
    public void modelMapper3() { //객체 하나
        Person person = personRepository.findById(1).get();
        PersonDto personDto = modelMapper.map(person,PersonDto.class);
        System.out.println(personDto.toString());
    }
    
    @Test 
    public void modelMapper4(){ //다수
        List<Person> personList = personRepository.findAll();
        List<PersonDto> personDtoList = personList.stream().map(person -> modelMapper.map(person, PersonDto.class)).collect(Collectors.toList());

        System.out.println(personDtoList.toString());

        List<Person> nextPersonList = personDtoList.stream().map(personDto->modelMapper.map(personDto,Person.class)).collect(Collectors.toList());
        System.out.println(nextPersonList.toString());
    }
}