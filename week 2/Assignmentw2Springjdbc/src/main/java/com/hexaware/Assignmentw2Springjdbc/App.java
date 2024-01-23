package com.hexaware.Assignmentw2Springjdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.Assignmentw2Springjdbc.config.AppConfig;
import com.hexaware.Assignmentw2Springjdbc.model.Car;
import com.hexaware.Assignmentw2Springjdbc.service.ICarService;
import com.hexaware.Assignmentw2Springjdbc.service.CarServiceImp;

/**
 * Hello world!
 *
 */
public class App {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		ICarService service = context.getBean(CarServiceImp.class);

		boolean flag = true;

		while (flag) {
			System.out.println("****WELCOME Car Management System ***");
			System.out.println("1. INSERT");
			System.out.println("2. SELECT BY ID");
			System.out.println("3. SELECT ALL");
			System.out.println("4. EXIT");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:

				Car car = readData();

				boolean isInserted = service.createCar(car);

				if (isInserted) {
					System.out.println("Record inserted successfully...");
				} else {

					System.err.println("Insert fail");
				}

				break;
				
				
			case 2:

				System.out.println("Enter Car Id");

				int pid1 = scanner.nextInt();

				Car carFound = service.selectCarById(pid1);

				if (carFound != null) {
					System.out.println(carFound);
				} else {

					
							// throw  new CarNotFoundExp();
					System.err.println("Car Not Found");
				}

				break;
				
			case 3:
				
					List<Car>  list =service.selectAllCars();
					
						for (Car c : list) {
							
								System.out.println(c);
							
						}
				
				break;
				

			case 4:

				flag = false;

				break;

			default:
				break;
			}

		}

	}

	public static Car readData() {

		Car car = new Car();

		System.out.println("Enter Car Id");

		car.setCarId(scanner.nextInt());

		System.out.println("Enter Car make");

		car.setMake(scanner.next());
		
		System.out.println("Enter Car model");

		car.setModel(scanner.next());
		
		System.out.println("Enter Location");

		car.setLocation(scanner.next());

		System.out.println("Enter dailyRate");

		car.setDailyRate(scanner.nextInt());
		
		System.out.println("Enter status");

		car.setStatus(scanner.next());
		
		System.out.println("Enter passenger capacity");

		car.setPassengerCapacity(scanner.nextInt());
		
		System.out.println("Enter specifications");

		car.setSpecifications(scanner.next());
		

		return car;

	}

}