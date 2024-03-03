package com.hexaware.springrestjpa.restcontroller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springrestjpa.entities.Employee;
import com.hexaware.springrestjpa.exception.EmployeeNotFoundException;
import com.hexaware.springrestjpa.service.EmployeeServiceImp;
import com.hexaware.springrestjpa.service.IEmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {

	Logger logger=LoggerFactory.getLogger(EmployeeRestController.class);
	
	@Autowired
	IEmployeeService service;

	@PostMapping("/add")
	public Employee insertEmployee(@RequestBody Employee emp) {
		logger.info("now adding");
		/*boolean isValid=EmployeeServiceImp.validateEmployeeData(emp);
		 * logger.info("now adding");
		Employee employee=null;
		if(isValid) {
		logger.warn("employee object is not null ");
		employee=service.addEmployee(emp);
		}
		return employee;*/
		return service.addEmployee(emp);
	}

	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody @Valid Employee emp) {
		return service.updateEmployee(emp);
	}

	@GetMapping("/get/{eid}")
	public Employee getEmployeeById(@PathVariable long eid)  throws EmployeeNotFoundException{
		//return service.getEmployeeById(eid);
		Employee emp=service.getEmployeeById(eid);
		if(emp==null) {
			throw new EmployeeNotFoundException();
		}
		return emp;
	}

	@DeleteMapping("/delete/{eid}")
	public String deleteById(@PathVariable long eid) {
		return service.deleteEmployeeById(eid);
	}

	@GetMapping("/getall")
	public List<Employee> getAll() {
		return service.getAllEmployees();
	}

	@GetMapping("/getbyename/{ename}") // if ("name") need to add it after path variable as well
	public List<Employee> getByEname(@PathVariable String ename) {
		return service.getByEname(ename);
	}

	@GetMapping("/getbysalarygt/{salary}")
	public List<Employee> getBySalaryGT(@PathVariable double salary) {
		return service.getBySalaryGT(salary);
	}

	

	@GetMapping("/getbysalarysorted")
	public List<Employee> getBySalarySorted() {
		return service.getBySalarySorted();
	}
	
	@GetMapping("/getbysalarybyrange/{min}/{max}")
	public List<Employee> getBySalaryRange(@PathVariable double min,@PathVariable double max) {
		return service.getBySalaryRange(min,max);
	}
	
	@DeleteMapping("/deletebyename/{ename}")
	public String deleteByEname(@PathVariable String ename) {
		int count =service.deleteByEname(ename);
		return count+" record deleted";
	}
}
