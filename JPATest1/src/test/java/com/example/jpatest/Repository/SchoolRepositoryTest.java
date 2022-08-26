package com.example.jpatest.Repository;

import com.example.jpatest.repository.SchoolRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import javax.transaction.Transactional;

@SpringBootTest
public class SchoolRepositoryTest {
    @Autowired
    SchoolRepository schoolRepository;

    /**
     *    jpa
     *     - FetchType.EAGER(즉시로딩) , FetchType.Lazy(지연로딩)
     *
     *    연관관계매핑
     *    단방향 Default
     *     - @OneToOne : EAGER  , OPTIONAL TRUE
     *     - @ManyToOne : EAGER , OPTIONAL TRUE
     *     - @OneToMany : LAZY
     *     - @ManyToMany : LAZY
     */

    /**
     *       optional 속성
     *         - true : null값 허용, outer join 쿼리 실행
     *         - false : inner join 실행
     */

    /**
     * @JoinColumn(nullable = true ) // outer join
     * @JoinColumn(nullable = false) // inner join
     */

    /**
     * @NotFound
     *  NotFoundAction.EXCEPTION
     *  NotFoundAction.IGNORE
     */

    /**
     *  연관관계는 크게 단방향과 양방향이 존재합니다.
     *  단방향은 한 객체만 다른 객체를 참조하는 것이고 양방향은 두 객체가 서로 참조하고 있는 것입니다.
     *  결과적으로 양방향은 서로 단방향으로 매핑되어 있으면 양방향 매핑이라고 할 수 있습니다.
    */

    @Test
    //@Transactional //fetch 타입이 lazy일때 필수.
    @Transactional
    public void schoolTest() {

        System.out.println(schoolRepository.findAll().toString());
        //schoolRepository.findAll();

    }
}




