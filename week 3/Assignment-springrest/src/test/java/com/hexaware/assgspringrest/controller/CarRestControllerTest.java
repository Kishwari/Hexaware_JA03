package com.hexaware.assgspringrest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.hexaware.assgspringrest.entity.Cars;

@SpringBootTest
class CarRestControllerTest {

	@Autowired
	RestTemplate restTemplate;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testInsertCar() {

		Cars car=new Cars(103,"Toyota","Glance","Available",10,"Mumbai","base model",5);
		ResponseEntity<Cars> response= restTemplate.postForEntity("http://localhost:8080/api/cars/add", car, Cars.class);
		Cars c=response.getBody();
		assertEquals(103,c.getCarId());
	}

	@Test
	void testUpdateCar() {

	}

	@Test
	void testGetCarById() {

		int cid=101;
		ResponseEntity<Cars> response= restTemplate.getForEntity("http://localhost:8080/api/cars/get/"+cid,Cars.class);
		Cars car=response.getBody();
		assertNotNull(car);
		assertEquals(101,car.getCarId());
		
	}

	@Test
	void testDeleteById() {
		//int id=104;
		//ResponseEntity<Cars> response=restTemplate.exchange("http://localhost:8080/api/cars/delete/"+id,org.springframework.http.HttpMethod.DELETE, Cars.class,id);
	}

	@Test
	void testGetAll() {
		List<Cars> list=restTemplate.getForObject("http://localhost:8080/api/cars/getall",List.class);
		assertNotNull(list);
		assertTrue(list.size() >0);
	}

}
