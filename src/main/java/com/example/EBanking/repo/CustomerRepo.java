package com.example.EBanking.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EBanking.entity.CustomerEntity;

public interface CustomerRepo extends JpaRepository<CustomerEntity, Integer> {

}
