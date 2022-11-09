package com.spring.beans;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class OrderDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderid;
	private int productid;
	private int cid;
	private Date shipmentdate;
	
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public Date getShipmentdate() {
		return shipmentdate;
	}
	public void setShipmentdate(Date shipmentdate) {
		this.shipmentdate = shipmentdate;
	}
	@Override
	public String toString() {
		return "OrderDetails [orderid=" + orderid + ", productid=" + productid + ", cid=" + cid + ", shipmentdate="
				+ shipmentdate + "]";
	}

}
