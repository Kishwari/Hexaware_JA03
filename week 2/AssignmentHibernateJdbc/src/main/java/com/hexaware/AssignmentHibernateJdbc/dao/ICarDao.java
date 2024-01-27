package com.hexaware.AssignmentHibernateJdbc.dao;
import java.util.List;

import com.hexaware.AssignmentHibernateJdbc.model.Car;

public interface ICarDao {
	
	
	public boolean  createCar(Car car);
	public boolean   updateCar(Car car);
	
	public boolean  deleteCarById(int carId);
	
	public Car  selectCarById(int carId);
	
	public  List<Car>  selectAllCars(); 

}