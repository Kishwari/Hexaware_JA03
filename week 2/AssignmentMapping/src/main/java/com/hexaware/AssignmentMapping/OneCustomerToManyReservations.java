package com.hexaware.AssignmentMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class OneCustomerToManyReservations {

	 public static void main( String[] args )
	    {
	    	
	    		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	    		Session session = sessionFactory.openSession();
	    		System.out.println(session);
	    		
	    		sessionFactory.close();
}
}