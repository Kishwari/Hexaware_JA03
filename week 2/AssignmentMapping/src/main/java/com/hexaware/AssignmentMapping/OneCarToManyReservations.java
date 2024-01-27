package com.hexaware.AssignmentMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.AssignmentMapping.entities.Cars;
import com.hexaware.AssignmentMapping.entities.Reservations;


/**
 * Hello world!
 *
 */
public class OneCarToManyReservations
{
    public static void main( String[] args )
    {
    	
    		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    		Session session = sessionFactory.openSession();
    		System.out.println(session);
    		//Transaction txn = session.beginTransaction();
    		
    		/* One to Many
    		Cars c1=new Cars(111,"Mahindra","XUV500","Banglore",65.0,"Available","SUV",7);
    		Cars c2=new Cars(222,"Tata","Harrier","Delhi",75.0,"Booked","SUV",5);
    		Cars c3=new Cars(333,"Hyundai","Venue","Chennai",55.0,"Available","Compact SUV",5);
    		Cars c4=new Cars(444,"Kia","Seltos","Kolkata",60.0,"Booked","Crossover",5);
    								
    		Reservations r1=new Reservations();
    		r1.setReservationId(100);
    		r1.setCustomerId(1);
    		r1.setReservationStatus(null);
    		r1.setDateOfReservation(null);
    		r1.setDateOfPickup(null);
    		r1.setDateOfDropoff(null);
    		// calling setCar method indirectly by calling addCar method
    		r1.addCar(c1);
    		r1.addCar(c2);
    		r1.addCar(c3);
    		r1.addCar(c4);
    		
    		session.persist(r1);*/
    		
    	//	txn.commit();
	        sessionFactory.close();
        
    }
}
