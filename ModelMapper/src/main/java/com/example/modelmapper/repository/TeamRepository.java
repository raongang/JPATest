package com.example.modelmapper.repository;

import com.example.modelmapper.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team,Integer> {


}
