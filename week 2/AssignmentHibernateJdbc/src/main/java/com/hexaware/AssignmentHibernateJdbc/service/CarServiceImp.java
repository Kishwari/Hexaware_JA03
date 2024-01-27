package com.hexaware.AssignmentHibernateJdbc.service;

import java.util.List;


import com.hexaware.AssignmentHibernateJdbc.dao.ICarDao;
import com.hexaware.AssignmentHibernateJdbc.model.Car;


public class CarServiceImp implements ICarService {

	
	private ICarDao dao;
	
	public CarServiceImp(ICarDao dao) {
		this.dao=dao;
	}
	
	@Override
	public boolean createCar(Car car) {
		return dao.createCar(car);
	}

	@Override
	public boolean updateCar(Car car) {
		return dao.updateCar(car);
	}

	@Override
	public boolean deleteCarById(int carId) {
		return  dao.deleteCarById(carId);
	}

	@Override
	public Car selectCarById(int carId) {
		return dao.selectCarById(carId);
	}

	@Override
	public List<Car> selectAllCars() {
		return  dao.selectAllCars();
	}


	}

