package com.hexaware.AssignmentMapping.dao;

import java.util.Date;
import java.util.List;

import com.hexaware.AssignmentMapping.entities.Cars;
import com.hexaware.AssignmentMapping.entities.Customers;
import com.hexaware.AssignmentMapping.entities.Payment;
import com.hexaware.AssignmentMapping.entities.Reservations;

public class AssignmentDaoImp implements IAssignmentDao {

	@Override
	public List<Cars> searchCars(String location, Date date, String vehicleType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reservations makeReservation(Customers customers, Cars cars, Date dateOfPickup, Date dateOfDropOff) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkAvailablity(String location, Date dateOfPickup, String make, String model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean provideFeedback(Customers customers, String feedback, int rating) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Payment> viewPaymentHistory(Customers customers) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void manageCustomers(Customers customers) {
		// TODO Auto-generated method stub

	}

	@Override
	public void manageCars(Cars cars) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Reservations> viewAllPayments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void discountOnCarPrice(double actualPrice, double discountPrice) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateCarPrice(double oldPrice, double newPrice) {
		// TODO Auto-generated method stub

	}

	@Override
	public void manageFeedbackAndDisputes() {
		// TODO Auto-generated method stub

	}

	@Override
	public void carFleetManagement() {
		// TODO Auto-generated method stub

	}

	@Override
	public void checkInAndCheckOut(Customers customers, Cars cars) {
		// TODO Auto-generated method stub

	}

	@Override
	public void provideMaintenanceAlert(Cars cars, String alertMessage) {
		// TODO Auto-generated method stub

	}

}
