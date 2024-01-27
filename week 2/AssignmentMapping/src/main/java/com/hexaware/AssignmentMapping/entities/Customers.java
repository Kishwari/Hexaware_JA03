package com.hexaware.AssignmentMapping.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Customers {

	@Id
	private  int customerId;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String password;
	private String phoneNumber;
	
	//for customers to payment (1-M)
	@OneToMany(mappedBy="customers")
	private Set<Payment> paymentSet;
	
	// for reservations to customers (1-M)
	@OneToMany(mappedBy="customers")
	private Set<Reservations> reservationSet=new HashSet<Reservations>();
	
	public Customers() {
		super();
	}


	public Customers(int customerId, String firstName, String lastName, String emailAddress, String password,
			String phoneNumbe,Set<Reservations> reservationSet, Set<Payment> paymentSet) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.reservationSet=reservationSet;
		this.paymentSet=paymentSet;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public Set<Reservations> getReservationSet() {
		return reservationSet;
	}


	public void setReservationSet(Set<Reservations> customerSet) {
		this.reservationSet = reservationSet;
	}
	public void addReservation(Reservations reservations) {
		// this.employeeSet.add(emp);
		Set<Reservations> set=getReservationSet();
		set.add(reservations);
	}

	
	public Set<Payment> getPaymentSet() {
		return paymentSet;
	}


	public void setPaymentSet(Set<Payment> paymentSet) {
		this.paymentSet = paymentSet;
	}

	public void addPayment(Payment payment) {
		// this.employeeSet.add(emp);
		Set<Payment> set=getPaymentSet();
		set.add(payment);
	}

	@Override
	public String toString() {
		return "Customers [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", emailAddress=" + emailAddress + ", password=" + password + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
}
