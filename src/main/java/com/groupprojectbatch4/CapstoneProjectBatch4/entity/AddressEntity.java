package com.groupprojectbatch4.CapstoneProjectBatch4.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Address_Details")
public class AddressEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Address_id")
	int address_Id;
	@Column(name="City")
	String city;
	@Column(name="Country")
	String country;
	@Column(name="State")
	String state;
	@Column(name="Street")
	String street;
	@Column(name="ZipCode")
	String zipcode;
	
	public int getAddress_Id() {
		return address_Id;
	}
	public void setAddress_Id(int address_Id) {
		this.address_Id = address_Id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	@Override
	public String toString() {
		return "AddressEntity [address_Id=" + address_Id + ", city=" + city + ", country=" + country + ", state=" + state
				+ ", street=" + street + ", zipcode=" + zipcode + "]";
	}
	
	public AddressEntity() {

	}
	public AddressEntity(int address_Id, String city, String country, String state, String street, String zipcode) {
		super();
		this.address_Id = address_Id;
		this.city = city;
		this.country = country;
		this.state = state;
		this.street = street;
		this.zipcode = zipcode;
	}
}
