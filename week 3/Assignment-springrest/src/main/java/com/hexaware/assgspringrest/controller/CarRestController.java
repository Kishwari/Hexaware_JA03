package com.hexaware.assgspringrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.assgspringrest.entity.Cars;
import com.hexaware.assgspringrest.service.CarServiceImp;
import com.hexaware.assgspringrest.service.ICarService;


@RestController
@RequestMapping("/api/cars")
public class CarRestController {

	@Autowired
	ICarService service;

	@PostMapping("/add")
	public Cars insertCar(@RequestBody Cars car) {
		/*boolean isValid=CarServiceImp.validateCarData(car);
		Cars employee=null;
		if(isValid) employee=service.addCar(car);
		return employee;*/
		return service.addCar(car);
	}

	@PutMapping("/update")
	public Cars updateCar(@RequestBody  Cars car) {
		return service.updateCar(car);
	}

	@GetMapping("/get/{carId}")
	public Cars getCarById(@PathVariable int carId) {
		return service.getCarById(carId);
	}

	@DeleteMapping("/delete/{carId}")
	public String deleteById(@PathVariable int carId) {
		return service.deleteCarById(carId);
	}

	@GetMapping("/getall")
	public List<Cars> getAll() {
		return service.getAllCars();
	}

	// custom
	
	
	/*@GetMapping("/getbymake/{make}") 
	public List<Cars> findByMake(@PathVariable String make) {
		return service.findByMake(make);
	}

	@GetMapping("/getbydailyrategt/{dailyRate}")
	public List<Cars> findByGTDailyRate(@PathVariable double dailyRate) {
		return service.findByGTDailyRate(dailyRate);
	}*/
	
	

}
