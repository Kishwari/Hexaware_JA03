package com.hexaware.mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mappings.entity.Address;
import com.hexaware.mappings.entity.Student;

/**
 * Hello world!
 *
 */
public class OntToOneMapping {
	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		System.out.println(session);
		Transaction txn = session.beginTransaction();

		/*
		 * uni directional // 1 Address address=new Address(21,"Hyderabad");
		 * 
		 * // 2 Address address=new Address(22,"Chennai"); Student student=new
		 * Student(101,"raju",address);
		 */

		

//1  session.persist(student); //internally persist child address object = cascade
// 2 session.persist(address); //uni directional only address parent will persist

		
		
		
/* 3  bi directional
		Address address = new Address(23, "Delhi");
		Student student = new Student(102, "smith", address);
		session.persist(student);  */

		
		
		// 4 through setter methods -bi directional
		//Student student = new Student(103, "ford");
		//Address address = new Address(24,"Mumbai",student); // thorugh constructor bi directional
		Student student = new Student(104, "mini");
		Address address = new Address();
		address.setAddressId(25);
		address.setCity("Noida");
		address.setStudent(student);
		
		session.persist(address);
		txn.commit();
		session.close();

	}
}
