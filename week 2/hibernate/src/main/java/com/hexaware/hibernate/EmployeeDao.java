package com.hexaware.hibernate;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.hexaware.hibernate.entity.Employee;

public class EmployeeDao {
	Session session;
	
	public EmployeeDao() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		 session = sessionFactory.openSession();
	}
	


	public List<Employee> geAllEmployees() {

		Query query = session.createNamedQuery("geAllEmployees");

		List<Employee> list = query.getResultList();

		return list;
				
		}	
	
		public  Employee  getEmployeeByName() {
						
			Query query = session.createNamedQuery("getEmployeeByName");
			
					query.setParameter(1,101);
			
				Employee emp= (Employee) query.getSingleResult();
			
			return emp;
		}	

}