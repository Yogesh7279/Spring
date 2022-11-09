package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.beans.OrderDetails;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer> {

}
