package com.spring.beans;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ShipmentDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int shipmentid;
	private int productid;
	private int cid;
	private Date shipmentdate;
	
	public int getShipmentid() {
		return shipmentid;
	}
	public void setShipmentid(int shipmentid) {
		this.shipmentid = shipmentid;
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
		return "ShipmentDetails [shipmentid=" + shipmentid + ", productid=" + productid + ", cid=" + cid
				+ ", shipmentdate=" + shipmentdate + "]";
	}
}
