package com.hexaware.AssignmentHibernateJdbc.service;

import java.util.List;

import com.hexaware.AssignmentHibernateJdbc.model.Car;

public interface ICarService {


	public boolean  createCar(Car car);
   public  boolean   updateCar(Car car);
	
	public boolean  deleteCarById(int carId);
	
	public Car  selectCarById(int carId);
	
	public  List<Car>  selectAllCars(); 
}
