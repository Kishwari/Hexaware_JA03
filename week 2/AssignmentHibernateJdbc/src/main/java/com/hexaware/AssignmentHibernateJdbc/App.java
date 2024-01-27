package com.hexaware.AssignmentHibernateJdbc;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.AssignmentHibernateJdbc.dao.CarDaoImp;
import com.hexaware.AssignmentHibernateJdbc.dao.ICarDao;
import com.hexaware.AssignmentHibernateJdbc.model.Car;

/**
 * Hello world!
 *
 */

public class App 
{
	static Scanner scanner = new Scanner(System.in);
    public static void main( String[] args )
    {	    
    		ICarDao dao=new CarDaoImp();
    	    
		boolean flag = true;

		while (flag) {
			System.out.println("****WELCOME Product Management System ***");
			System.out.println("1. INSERT");
			System.out.println("2. UPDATE");
			System.out.println("3. DELETE");
			System.out.println("4. SELECT BY ID");
			System.out.println("5. SELECT ALL");
			System.out.println("6. EXIT");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
			    
				Car c1 = readData();
				
                boolean isInserted = dao.createCar(c1);
                if (isInserted)
                    System.out.println("Car inserted successfully");
                else
                    System.out.println("Insertion failed");
				
				break;

			case 2:
				Car c2=readData();
				boolean isUpdated = dao.updateCar(c2);
                if (isUpdated)
                    System.out.println("Car updated successfully");
                else
                    System.out.println("Updation failed");
                break;
				
				

			case 3:
				System.out.println("Enter Car ID");
                int carId = scanner.nextInt();
                boolean isDeleted = dao.deleteCarById(carId);
                if (isDeleted)
                    System.out.println("Car deletion successful");
                else
                    System.out.println("Deletion failed");
                break;

				
				
				
			case 4:
				System.out.println("Enter Car ID");
                int carId2 = scanner.nextInt();
                Car car = dao.selectCarById(carId2);
                if (car != null) {
                    System.out.println("Car found: " + car);
                } else {
                    System.out.println("No car found for the specified id.");
                }
				
			

				break;
				
			case 5:
				List<Car> carList = dao.selectAllCars();
                if (carList.isEmpty()) {
                    System.out.println("No cars found");
                } else {
                    for (Car c : carList)
                        System.out.println(c.toString());
                }
				
				break;
				

			case 6:

				flag = false;
				System.out.println("Thank You!!");

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
		
		
		System.out.println("Enter specifications");

		car.setSpecifications(scanner.next());
		
		System.out.println("Enter passenger capacity");

		car.setPassengerCapacity(scanner.nextInt());
		

		return car;

	}
}
