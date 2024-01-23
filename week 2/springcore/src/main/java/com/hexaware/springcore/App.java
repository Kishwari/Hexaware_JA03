package com.hexaware.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.springcore.entities.Address;
import com.hexaware.springcore.entities.Employee;
import com.hexaware.springcore.services.IService;
import com.hexaware.springcore.services.ServiceImp;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Address address = context.getBean(Address.class);
		address.setCity("Hyderabad");
		Employee emp = context.getBean("emp", Employee.class);
		emp.setEid(101);
		emp.setEname("king");
		emp.setAddress(address);// Setter method DI

		System.out.println(emp);

		// System.out.println(emp.getAddress()); if we get object auto wiring happening
		// orelse null
		IService service = context.getBean(ServiceImp.class);
		service.getService();

		String name = context.getBean(String.class);

		System.out.println(name);

	}
}
