package com.hexaware.Assignmentw2Springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hexaware.Assignmentw2Springjdbc.model.Car;


public class CarMapper implements RowMapper<Car> {

	@Override
	public Car mapRow(ResultSet rs, int rowNum) throws SQLException {

		Car car = new Car();

		car.setCarId(rs.getInt("carId"));
		car.setMake(rs.getString("make"));
		car.setModel(rs.getString("model"));
		car.setLocation(rs.getString("location"));
		car.setDailyRate(rs.getInt("dailyRate"));
		car.setStatus(rs.getString("status"));
		car.setPassengerCapacity(rs.getInt("passengerCapacity"));
		car.setSpecifications(rs.getString("specifications"));

		return car;
	}

}