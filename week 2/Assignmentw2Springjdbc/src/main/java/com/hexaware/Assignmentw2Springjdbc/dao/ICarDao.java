package com.hexaware.Assignmentw2Springjdbc.dao;

import java.util.List;

import com.hexaware.Assignmentw2Springjdbc.model.Car;

public interface ICarDao {
	
	public boolean  createCar(Car car);
	
	public Car  selectCarById(int carId);
	
	public  List<Car>  selectAllCars();
}
