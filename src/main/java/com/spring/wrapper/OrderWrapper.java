package com.spring.wrapper;

import com.spring.beans.OrderDetails;
import com.spring.beans.ShipmentDetails;

public class OrderWrapper {
	
	private OrderDetails orderDetails=null;
	private ShipmentDetails shipmentDetails=null;
	
	public OrderDetails getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(OrderDetails orderDetails) {
		this.orderDetails = orderDetails;
	}
	public ShipmentDetails getShipmentDetails() {
		return shipmentDetails;
	}
	public void setShipmentDetails(ShipmentDetails shipmentDetails) {
		this.shipmentDetails = shipmentDetails;
	}
	@Override
	public String toString() {
		return "OrderWrapper [orderDetails=" + orderDetails + ", shipmentDetails=" + shipmentDetails + "]";
	}

}
