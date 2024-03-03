package com.hexaware.springrestjpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.springrestjpa.entities.Employee;

@Repository  // not mandatory just for readability , its already there for implementation class
public interface IEmployeeRepository extends JpaRepository<Employee,Long>{

	List<Employee> findByEname(String ename);
	// select * from table_name where ename=?;
	
	List<Employee> findBySalaryGreaterThan(double salary);
	// select * from table_name where salary > ?;

	@Query("select e from Employee e where e.salary Between ?1 and ?2") // JPQL ,for name parameters :min and :max
	List<Employee> getBySalRange(double min,double max);
	
	@Modifying // open session transaction
 	@Query("delete from Employee e where e.ename=?1")
	int deletebyEname(String ename);
	
}
