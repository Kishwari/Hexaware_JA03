package com.hexaware.mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mappings.entity.Department;
import com.hexaware.mappings.entity.Employee;

public class OneToMany_ManyToOne_Mapping {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();
	System.out.println(session);
	Transaction txn = session.beginTransaction();
	
	/* One to Many
	Employee e1=new Employee(101,"King",55000);
	Employee e2=new Employee(102,"Smith",30000);
	Employee e3=new Employee(103,"Ford",40000);
	Employee e4=new Employee(104,"Ravi",25000);
							
	Department d1=new Department();
	d1.setDepartmentId(10);
	d1.setDepartmentName("Development");
	// calling setEmployee method indirectly by calling addEmployee method
	d1.addEmployee(e1);
	d1.addEmployee(e2);
	d1.addEmployee(e3);
	d1.addEmployee(e4);
	
	session.persist(d1);
	
	*/
	//Many to One

	Employee e1=new Employee(105,"Mini",45000);
	Employee e2=new Employee(106,"Shimi",35000);
	Employee e3=new Employee(107,"Kort",60000);
	Employee e4=new Employee(108,"Bretney",67000);
							
	Department d1=new Department();
	d1.setDepartmentId(20);
	d1.setDepartmentName("Testing");
	// calling setEmployee method indirectly by calling addEmployee method
	d1.addEmployee(e1);
	d1.addEmployee(e2);
	d1.addEmployee(e3);
	d1.addEmployee(e4);
	
	session.persist(d1);
	
	txn.commit();
	sessionFactory.close();
	
}
}
