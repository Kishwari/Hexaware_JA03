package com.hexaware.assgspringrest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.assgspringrest.entity.Cars;
import com.hexaware.assgspringrest.repository.CarRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CarServiceImp implements ICarService {

	@Autowired
	CarRepository repo;
	
	
	@Override
	public Cars addCar(Cars car) {

		return repo.save(car);
	}

	@Override
	public Cars updateCar(Cars car) {

		return repo.save(car);
	}

	@Override
	public Cars getCarById(int carId) {
		
		Optional<Cars> optional=repo.findById(carId);
		Cars car=null;
		 if(optional.isPresent()) {
			 car=optional.get();
		 }
		 return car;
	}

	@Override
	public String deleteCarById(int carId) {
		
		 repo.deleteById(carId);
		 return "Record deleted";
	}

	@Override
	public List<Cars> getAllCars() {
		
		return repo.findAll();
	}

	
	/*public List<Cars> findByMake(String make) {
		
		return repo.findByMake(make);
	}

	
	public List<Cars> findByGTDailyRate(double dailyRate) {
		
		return repo.findByGTDailyRate(dailyRate);

	}*/

	// inout validation
	
	
	/*	public static boolean validateCarData(Cars car) {
			String make=car.getMake();
			boolean flag=false;
			if(car.getCarId() >99 && car.getDailyRate() >200 && make.equals(make.toUpperCase())) {
				
				flag=true;
				
			}
			return flag;
		}*/
	

}