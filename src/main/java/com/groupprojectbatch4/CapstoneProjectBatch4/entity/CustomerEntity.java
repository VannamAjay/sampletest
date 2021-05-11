package com.groupprojectbatch4.CapstoneProjectBatch4.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer_Details")
public class CustomerEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Customer_id")
	int customer_Id;
	@Column(name="first_name")
	String first_Name;
	@Column(name="last_name")
	String last_Name;
	@Column(name="email")
	String email;

	public CustomerEntity(int customer_Id, String first_Name, String last_Name, String email) {
		super();
		this.customer_Id = customer_Id;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.email = email;
	}
	@Override
	public String toString() {
		return "CustomerEntity [customer_Id=" + customer_Id + ", first_Name=" + first_Name + ", last_Name=" + last_Name
				+ ", email=" + email + "]";
	}
	public int getCustomer_Id() {
		return customer_Id;
	}
	public void setCustomer_Id(int customer_Id) {
		this.customer_Id = customer_Id;
	}
	public CustomerEntity() {
		super();
	}
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}