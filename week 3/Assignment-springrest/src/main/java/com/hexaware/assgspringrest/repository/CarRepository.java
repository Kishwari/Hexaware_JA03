package com.hexaware.assgspringrest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.assgspringrest.entity.Cars;



@Repository
public interface CarRepository extends JpaRepository<Cars,Integer>{
	
	//List<Cars> findByMake(String make);
	// select * from table_name where make=?;
	
	//List<Cars> findByGTDailyRate(double dailyRate);
	// select * from table_name where dailyRate > ?;


}
