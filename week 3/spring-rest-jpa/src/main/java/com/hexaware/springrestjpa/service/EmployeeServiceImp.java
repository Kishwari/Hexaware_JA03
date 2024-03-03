package com.hexaware.springrestjpa.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.hexaware.springrestjpa.entities.Employee;
import com.hexaware.springrestjpa.repository.IEmployeeRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeServiceImp implements IEmployeeService {

	Logger logger=LoggerFactory.getLogger(EmployeeServiceImp.class);
	
	@Autowired
	IEmployeeRepository repo;
	
	@Override
	public Employee addEmployee(Employee employee) {

		logger.info(employee+" is added from add service");
		return repo.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {

		return repo.save(employee);
	}

	@Override
	public Employee getEmployeeById(long eid) {

	//	return repo.findById(eid); return type id optional and not Employee
		 Optional<Employee> optional=repo.findById(eid);
		 Employee emp=null;
		 if(optional.isPresent()) {
			 emp=optional.get();
		 }
		 return emp;
	//	return repo.findById(eid),orElse(null);
	}

	@Override
	public String deleteEmployeeById(long eid) {

		 repo.deleteById(eid);
		 return "Record deleted";
	}

	@Override
	public List<Employee> getAllEmployees() {

		return repo.findAll();
	}

	
	
	
	// user defined 
	
	
	
	@Override
	public List<Employee> getByEname(String ename) {
		return repo.findByEname(ename);
	}

	@Override
	public List<Employee> getBySalaryGT(double salary) {

		return repo.findBySalaryGreaterThan(salary);
	}

	@Override
	public List<Employee> getBySalarySorted() {

		//return repo.findAll(Sort.by(Order.asc("salary")));
		//return repo.findAll(Sort.by(Order.desc("salary")));
		return repo.findAll(Sort.by("salary"));
	}

	@Override
	public List<Employee> getBySalaryRange(double min, double max) {

		return repo.getBySalRange(min, max);
	}

	@Override
	public int deleteByEname(String ename) {

		return repo.deletebyEname(ename) ;
	}

	
	
	// inout validation
	
	
	/*public static boolean validateEmployeeData(Employee emp) {
		String ename=emp.getEname();
		boolean flag=false;
		if(emp.getEid() >99 && emp.getSalary() >1000 && ename.equals(ename.toUpperCase())) {
			
			flag=true;
			
		}
		return flag;*/
	
}
