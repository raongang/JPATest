package com.example.jpatest2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  연관관계 주인
 *    - 이전 포스팅에서 양방향으로 매핑이 되는 것은 두 객체 모두 단방향 매핑이 되는것이라고 언급한 적이 있습니다.
 *      사실 객체들간의 연관관계 매핑은 단방향 매핑만 해주는 것이 좋습니다.
 *      왜냐하면 단방향 매핑만으로 연관관계 매핑은 이미 이루어진 상태이고 만약 양방향으로 매핑하게 되면 양쪽을 모두 신경 써야 하기 때문에 복잡도가 올라가기 때문입니다.
 *      그럼에도 불구하고 양방향 매핑이 필요할 경우에는 두 객체들 중 연관관계의 주인을 정해줘야 합니다.
 *      연관관계의 주인은 외래키가 있는 객체로 정해주면 됩니다.
 *
         연관관계의 주인이 된다는 것은 데이터베이스에서 본인 테이블은 물론이고 연관 엔티티의 테이블에도 영향을 준다는 의미입니다.
         데이터 조회뿐만 아니라 삭제, 생성 등에도 영향을 미친다는 것이죠.
         반대로 연관관계의 주인이 아닌 엔티티는 연관 엔티티의 테이블에 영향을 주지 못하기 때문에 단순히 데이터 조회만 가능합니다.

         연관관계의 주인과 주인이 아닌 것을 구분하는 방법은 @JoinColumn의 존재 유무입니다.
         양방향 매핑은 단방향 매핑을 서로 하는 것이라고 해서 @JoinColumn이 양쪽에 모두 존재하는 것이 아닙니다.
         연관관계의 주인에만 @JoinColumn이 존재하고 연관관계의 주인이 아닌 경우에는 @JoinColumn대신 다중성(Multiplicity)에 mappedBy 속성을 추가해주면 됩니다.
 *
 *
 */

/**
 *    CasedType
 *   CascadeType은 다중성(Multiplicity)의 속성 중 하나로 연관 엔티티에 대한 영속성 처리 설정을 해주기 위해 사용됩니다.
 *
     * 사용되는 설정 타입은 다음과 같이 존재합니다.
     * CascadeType.DETACH
     * CascadeType.MERGE
     * CascadeType.PERSIST
     * CascadeType.REFRESH
     * CascadeType.REMOVE
     * CascadeType.ALL

     * 설정타입 모두 엔티티가 Cascade Type에 속하는 기능을 수행했을 때 연관 엔티티도 동일한 기능을 수행하도록 해줍니다. (ALL은 모든 타입이 적용)
     * 참고적으로 Cascade Type은 연관 엔티티에도 영향을 미치기 때문에 정말 필요한 타입만 명시하여 사용하는 것이 좋습니다.
 *
 *
 */

@SpringBootApplication
public class JpaTest2Application {
    public static void main(String[] args) {
        SpringApplication.run(JpaTest2Application.class, args);
    }



}
