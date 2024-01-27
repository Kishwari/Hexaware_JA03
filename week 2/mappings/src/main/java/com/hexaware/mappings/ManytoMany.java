package com.hexaware.mappings;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mappings.entity.Order;
import com.hexaware.mappings.entity.Product;

public class ManytoMany {

	public static void main(String args[]) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		System.out.println(session);
		Transaction txn = session.beginTransaction();
		
		Product p1=new Product();
		p1.setProductId(70);
		p1.setProductName("Toys");
		
		Product p2=new Product();
		p2.setProductId(71);
		p2.setProductName("Books");
		
		Product p3=new Product();
		p3.setProductId(72);
		p3.setProductName("Clothes");
		
		Order o1=new Order();
		o1.setOrderId(200);
		o1.setPurchasedDate(LocalDate.now());
		
		o1.addProduct(p1);  o1.addProduct(p3);
		
		
		Order o2=new Order();
		o2.setOrderId(300);
		o2.setPurchasedDate(LocalDate.now());
		
		o2.addProduct(p1);    o2.addProduct(p2);   o2.addProduct(p3);
		
		session.persist(o1);
		session.persist(o2);
		
		txn.commit();
		session.close();
	}
}
