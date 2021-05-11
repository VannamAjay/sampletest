package com.groupprojectbatch4.CapstoneProjectBatch4.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Order_Details")
public class OrderEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Order_id")
	int order_Id;
	@Column(name="Total_Quantity")
	int total_Quantity;
	@Column(name="Address_id")
	int address_Id;
	@Column(name="Customer_Id")
	int customer_Id;
	@Column(name="Total_Price")
	double total_Price;

	public OrderEntity() {

	}
	public OrderEntity(int order_Id, int total_Quantity, int address_Id, int customer_Id, double total_Price) {
		super();
		this.order_Id = order_Id;
		this.total_Quantity = total_Quantity;
		this.address_Id = address_Id;
		this.customer_Id = customer_Id;
		this.total_Price = total_Price;
	}
	@Override
	public String toString() {
		return "OrderEntity [order_Id=" + order_Id + ", total_Quantity=" + total_Quantity + ", address_Id=" + address_Id
				+ ", customer_Id=" + customer_Id + ", total_Price=" + total_Price + "]";
	}
	public int getOrder_Id() {
		return order_Id;
	}
	public void setOrder_Id(int order_Id) {
		this.order_Id = order_Id;
	}
	public int getTotal_Quantity() {
		return total_Quantity;
	}
	public void setTotal_Quantity(int total_Quantity) {
		this.total_Quantity = total_Quantity;
	}
	public int getAddress_Id() {
		return address_Id;
	}
	public void setAddress_Id(int address_Id) {
		this.address_Id = address_Id;
	}
	public int getCustomer_Id() {
		return customer_Id;
	}
	public void setCustomer_Id(int customer_Id) {
		this.customer_Id = customer_Id;
	}
	public double getTotal_Price() {
		return total_Price;
	}
	public void setTotal_Price(double total_Price) {
		this.total_Price = total_Price;
	}
}
