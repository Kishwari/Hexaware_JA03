package com.hexaware.Assignmentw2Springjdbc.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexaware.Assignmentw2Springjdbc.model.Car;

@Repository
public class CarDaoImp implements ICarDao {

	JdbcTemplate jdbcTemplate;

	@Autowired
	public CarDaoImp(DataSource datasource) {

		jdbcTemplate = new JdbcTemplate(datasource);

		System.out.println(jdbcTemplate);

	}
	
	@Override
	public boolean createCar(Car car) {
		
		String insertQuery = "insert into Cars(carId,make,model,location,dailyRate,status,passengerCapacity,specifications) values(?,?,?,?,?,?,?,?)";

		int count = jdbcTemplate.update(insertQuery, car.getCarId(),car.getMake(),car.getModel(),car.getLocation(),car.getDailyRate(),car.getStatus(),car.getPassengerCapacity(),car.getSpecifications());

		return count > 0;
	}

	@Override
	public Car selectCarById(int carId) {
		
		String selectQueryById = "select carId,make,model,location,dailyRate,status,passengerCapacity,specifications from Cars where carId = ?";

		Car car = jdbcTemplate.queryForObject(selectQueryById, new CarMapper(), carId);

		return car;
	}

	@Override
	public List<Car> selectAllCars() {
		
		String selectQuery = "select carId,make,model,location,dailyRate,status,passengerCapacity,specifications from Cars";

		List<Car> list = jdbcTemplate.query(selectQuery, new CarMapper());

		return list;
	}

}
