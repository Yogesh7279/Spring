package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.beans.ShipmentDetails;

public interface ShipmentDetailsRepository extends JpaRepository<ShipmentDetails, Integer> {

}
