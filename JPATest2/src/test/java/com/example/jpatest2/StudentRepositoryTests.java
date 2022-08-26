package com.example.jpatest2;


/**
 *    사실 객체들간의 연관관계 매핑은 단방향 매핑만 해주는 것이 좋습니다.
 *    왜냐하면 단방향 매핑만으로 연관관계 매핑은 이미 이루어진 상태이고 만약 양방향으로 매핑하게 되면 양쪽을 모두 신경 써야 하기 때문에 복잡도가 올라가기 때문입니다.
     그럼에도 불구하고 양방향 매핑이 필요할 경우에는 두 객체들 중 연관관계의 주인을 정해줘야 합니다.
 *
      연관관계의 주인은 외래키가 있는 객체로 정해주면 됩니다.
 */

@SpringBootTest
public class StudentRepositoryTests {

    @Autowired
    StudentRepository studentRepository;

    @Test
    public void studentTest(){
        School school = new School();
        school.setStudentId("1111");
        school.setName("밥천국");
        school.setScore(95);

        studentRepository.save(student);

    }
}
