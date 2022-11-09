package com.spring.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.beans.OrderDetails;
import com.spring.beans.ShipmentDetails;
import com.spring.repository.OrderDetailsRepository;
import com.spring.repository.ShipmentDetailsRepository;
import com.spring.wrapper.OrderWrapper;

@Service
public class OrderService {
	
	@Autowired
	private OrderDetailsRepository orderrepo=null;
	@Autowired
	private ShipmentDetailsRepository shipmentrepo=null;
	
	@Transactional
	public void saveOrder(OrderWrapper wrapper) {
		
		OrderDetails orderdetail = wrapper.getOrderDetails();
		orderrepo.save(orderdetail);
		
//		int i = 10/0;
		
		ShipmentDetails shipmentdetail = wrapper.getShipmentDetails();
		shipmentrepo.save(shipmentdetail);
	}

}
