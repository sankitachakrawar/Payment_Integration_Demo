package com.pay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pay.entities.OrderRequest;

public interface PayRepository extends JpaRepository<OrderRequest, Long>{

}
