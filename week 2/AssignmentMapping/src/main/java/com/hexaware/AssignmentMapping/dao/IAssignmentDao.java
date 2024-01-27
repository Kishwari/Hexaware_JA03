package com.hexaware.AssignmentMapping.dao;

import java.util.Date;
import java.util.List;

import com.hexaware.AssignmentMapping.entities.Cars;
import com.hexaware.AssignmentMapping.entities.Customers;
import com.hexaware.AssignmentMapping.entities.Payment;
import com.hexaware.AssignmentMapping.entities.Reservations;

public interface IAssignmentDao {

	//Customer
		List<Cars> searchCars(String location, Date date, String vehicleType);
		Reservations makeReservation(Customers customers,Cars cars,Date dateOfPickup,Date dateOfDropOff);
		//boolean manageReservations();
		boolean checkAvailablity(String location,Date dateOfPickup,String make,String model);
		boolean provideFeedback(Customers customers,String feedback,int rating);
		//made these 2
		//boolean viewBill();
		List<Payment> viewPaymentHistory(Customers customers);
		
		
		
		//Manager
		void manageCustomers(Customers customers);
		void manageCars(Cars cars);
		List<Reservations> viewAllPayments();
		void discountOnCarPrice(double actualPrice,double discountPrice);
		void updateCarPrice(double oldPrice,double newPrice);
		//Report generateReports(Date stratDate, Date endDate,ReportType reportType);
		void manageFeedbackAndDisputes();
		void carFleetManagement();
		
		
		
		//Rental Agent
		void checkInAndCheckOut(Customers customers,Cars cars);
		void provideMaintenanceAlert(Cars cars,String alertMessage);
		//boolean manageVehicleInventory();
		//boolean provideVehicleMaintenance();
}
