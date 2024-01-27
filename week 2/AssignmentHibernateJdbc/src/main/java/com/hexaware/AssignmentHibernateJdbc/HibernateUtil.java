package com.hexaware.AssignmentHibernateJdbc;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import org.hibernate.SessionFactory;

public class HibernateUtil {

	private static final SessionFactory sessionFactory;
	static {
		
	
	StandardServiceRegistry standardRegistry=new StandardServiceRegistryBuilder()
			.configure("hibernate.cfg.xml")
			.build();
	Metadata metaData=new MetadataSources(standardRegistry)
			.getMetadataBuilder()
			.build();
	sessionFactory=metaData.getSessionFactoryBuilder().build();
	}
	
	public static SessionFactory getSession() {
		return sessionFactory;
	}

	public static SessionFactory getSessionFactory() {
		// TODO Auto-generated method stub
		return sessionFactory;
	}
	
}
