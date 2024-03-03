package com.hexaware.assgspringrest.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hexaware.assgspringrest.entity.Cars;


@SpringBootTest
class CarServiceImpTest {

	@Autowired
	ICarService service;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	@DisplayName("InsertCar")
	void testAddCar() {
		Cars car=new Cars(104,"MG","Hector","Unavailable",50,"Kolkata","Hybrid",5);
		Cars c=service.addCar(car);
		assertNotNull(c);
		assertEquals(104,c.getCarId());
		assertTrue(c.getCarId() >0);
	}

	@Test
	void testUpdateCar() {

	}

	@Test
	void testGetCarById() {

		Cars car=service.getCarById(101);
		assertEquals("Maruti",car.getMake());
		assertNotEquals("Glance",car.getMake());
	}

	@Test
	void testDeleteCarById() {
		String car=service.deleteCarById(104);
		assertEquals("Record deleted",car);
	}
	

	@Test
	void testGetAllCars() {
		List list=service.getAllCars();
		boolean flag=list.isEmpty();
		assertFalse(flag);
	}

}
