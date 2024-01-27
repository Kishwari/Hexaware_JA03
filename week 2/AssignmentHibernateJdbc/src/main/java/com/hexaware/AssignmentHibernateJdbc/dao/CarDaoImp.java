package com.hexaware.AssignmentHibernateJdbc.dao;

import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hexaware.AssignmentHibernateJdbc.HibernateUtil;
import com.hexaware.AssignmentHibernateJdbc.model.Car;


public class CarDaoImp implements ICarDao {
 
	private   SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
	    Session session=sessionFactory.openSession(); 

	
	 

	@Override
	public boolean createCar(Car car) {	
		try (Session session = sessionFactory.openSession()) {
            Transaction txn = session.beginTransaction();
            session.save(car);
            txn.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
	}

	
	@Override
	public boolean updateCar(Car car) {			 //for update
		
		try (Session session = sessionFactory.openSession()) {
            Transaction txn = session.beginTransaction();
            session.update(car);
            txn.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
	}

	@Override
	public boolean deleteCarById(int carId) { 		  //for delete
		try (Session session = sessionFactory.openSession()) {
            Transaction txn = session.beginTransaction();
            Car car = session.get(Car.class, carId);
            if (car != null) {
                session.delete(car);
                txn.commit();
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
	}

	@Override
	public Car selectCarById(int carId) {		// select by id
		try (Session session = sessionFactory.openSession()) {
            Query query = session.createNamedQuery("selectCarById");
            query.setParameter("id", carId);
            Car car = (Car) query.getSingleResult();
            return car;
        } catch (NoResultException e) {
            // Handle the case where no user is found with the given name
            return null;
        }
	}

	@Override
	public List<Car> selectAllCars() { 		// select all
		try (Session session = sessionFactory.openSession()) {
            return session.createQuery("FROM Cars", Car.class).list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
	} 
	

}
