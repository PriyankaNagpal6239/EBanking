package com.example.EBanking.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EBanking.entity.CardEntity;

@Repository
public interface CardRepo extends JpaRepository<CardEntity, Integer>{

}
