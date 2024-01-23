package com.hexaware.Assignmentw2Springjdbc.service;

import java.util.List;

import com.hexaware.Assignmentw2Springjdbc.model.Car;


public interface ICarService {
	
	
			public boolean  createCar(Car car);
			
			public Car  selectCarById(int carId);
			
			public  List<Car>  selectAllCars();

}