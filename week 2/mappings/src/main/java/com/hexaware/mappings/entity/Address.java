package com.hexaware.mappings.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {

	@Id
	private int addressId;
	private String city;
	
	@OneToOne(mappedBy="address",cascade = CascadeType.ALL) // at owning side mention opposite side reference variable of this class
	Student student; // for bi-directional
	
	public Address() {
		
	}
	public Address(int addressId, String city,Student student) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.student=student;
		
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", student=" + student + "]";
	}
	
	
}
