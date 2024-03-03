package com.hexaware.springrestdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springrestdemo.entity.Employee;
import com.hexaware.springrestdemo.respository.IEmployeeRepository;

@Service
public class EmployeeServiceImp implements IEmployeeService {

	@Autowired
	IEmployeeRepository dao;
	
	
	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return dao.addEmployee(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return dao.updateEmployee(employee);
	}

	@Override
	public Employee getEmployeeById(int eid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteEmployeeById(int eid) {
		// TODO Auto-generated method stub
		return dao.deleteEmployeeById(eid);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return dao.getAllEmployees();
	}

}
