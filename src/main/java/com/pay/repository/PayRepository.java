package com.pay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pay.entities.OrderEntity;

public interface PayRepository extends JpaRepository<OrderEntity, Long>{

}
