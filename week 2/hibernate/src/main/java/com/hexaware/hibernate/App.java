package com.hexaware.hibernate;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.hibernate.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
    System.out.println(sessionFactory);
    Session session=sessionFactory.openSession();
    System.out.println(session);
    
    Transaction txn=session.beginTransaction(); // Mandatory for DML ,transaction begin
    
   /* Employee emp=new Employee(101,"tom ",50000); //for insert
    Serializable ser= session.save(emp); // insert or update
    System.out.println(ser.toString()); */
    
 /*   //updating record
    Employee emp1=session.get(Employee.class, 101); //fetching object of id 101 which already persist
    System.out.println(emp1);
    emp1.setEname("tom jerry");
    emp1.setSalary(60000);
    Serializable ser= session.save(emp1); // insert or update
    System.out.println("updated record : " +ser.toString());
    // printing to check the update
    Employee updatedEmp=session.get(Employee.class, 101);
    System.out.println(updatedEmp); */

    //session.delete(updatedEmp);//delete
   
    
    Employee emp2=new Employee(102,"king ",70000);
    Employee emp3=new Employee(103,"ford ",40000);
    Employee emp4=new Employee(104,"smith ",63000);
    Serializable ser= session.save(emp2); 
    Serializable ser2= session.save(emp3);
    Serializable ser3= session.save(emp4);
    System.out.println(ser.toString());
    System.out.println(ser2.toString());
    System.out.println(ser3.toString());
    
    
    Employee e = new Employee(103,"adam sir",75000);
	
	session.saveOrUpdate(e);
	
//	session.persist(e);  // insert and update

    
    
    
    
    
    txn.commit(); // transaction end
    
    //null value exception when try to access record not in table
    }
}
