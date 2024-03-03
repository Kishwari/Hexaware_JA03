package com.hexaware.assgspringrest.service;

import java.util.List;

import com.hexaware.assgspringrest.entity.Cars;


public interface ICarService {

	public Cars addCar(Cars car);
	 
	public Cars updateCar(Cars car);
 
	public Cars getCarById(int carId);
 
	public String deleteCarById(int carId);
	
	public  List<Cars>  getAllCars();
	
	// custom
	
	//List<Cars> findByMake(String make);
	
	//List<Cars> findByGTDailyRate(double dailyRate);
}
