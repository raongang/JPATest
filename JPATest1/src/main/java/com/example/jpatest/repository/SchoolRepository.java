package com.example.jpatest.repository;


import com.example.jpatest.dto.dto.School;
import org.springframework.data.jpa.repository.JpaRepository;

// 제네릭 타입: <엔티티 클래스, 엔티티클래스의 기본키>

public interface SchoolRepository extends JpaRepository<School,Integer> {
    
}
