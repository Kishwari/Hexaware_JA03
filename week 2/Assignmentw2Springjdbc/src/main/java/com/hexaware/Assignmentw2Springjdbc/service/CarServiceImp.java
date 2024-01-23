package com.hexaware.Assignmentw2Springjdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.Assignmentw2Springjdbc.dao.ICarDao;
import com.hexaware.Assignmentw2Springjdbc.model.Car;

@Service
public class CarServiceImp implements ICarService {

	@Autowired
	ICarDao dao;
	
	@Override
	public boolean createCar(Car car) {
		
		return dao.createCar( car);
	}

	@Override
	public Car selectCarById(int carId) {
		
		return dao.selectCarById( carId);
	}

	@Override
	public List<Car> selectAllCars() {
		
		return dao.selectAllCars();
	}

}
