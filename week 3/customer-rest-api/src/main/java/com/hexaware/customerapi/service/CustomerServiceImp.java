package com.hexaware.customerapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hexaware.customerapi.dto.CustomerDTO;
import com.hexaware.customerapi.dto.CustomerProductVO;
import com.hexaware.customerapi.dto.Product;
import com.hexaware.customerapi.entity.Customer;
import com.hexaware.customerapi.repository.CustomerRepository;

@Service
public class CustomerServiceImp implements ICustomerService {

	@Autowired
	CustomerRepository repo;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Override
	public Customer addCustomer(CustomerDTO customerDTO) {

		Customer customer=new Customer();
		customer.setCustomerId(customerDTO.getCustomerId());
		customer.setCustomerName(customerDTO.getCustomerName());
		customer.setDateofBirth(customerDTO.getDateofBirth());
		customer.setProductId(customerDTO.getProductId());
		return repo.save(customer);
	}

	@Override
	public CustomerDTO getCustomerById(int customerId) {

		Customer customer=repo.findById(customerId).orElse(null);
		CustomerDTO dto=new CustomerDTO();
		dto.setCustomerId(customer.getCustomerId());
		dto.setCustomerName(customer.getCustomerName());
		dto.setDateofBirth(customer.getDateofBirth());
		dto.setProductId(customer.getProductId());
		return dto;
	}

	@Override
	public List<Customer> getAllCustomer() {

		return repo.findAll();
	}

	@Override
	public CustomerProductVO getCustomerAndProductById(int customerId) {
		
		//step1
		CustomerDTO  customer=getCustomerById(customerId);
		//step2 call rest api from product microservice customer.getProductById();
		//Product      // http://localhost:8080/api/products/get/{pid}
		int pid=customer.getProductId();
		Product product=restTemplate.getForObject("http://localhost:8080/api/products/get/"+pid,Product.class);
		return new CustomerProductVO(customer,product);
	}

	// half not running 
	@Override
	public String deleteCustomerAndProductById(int customerId) {
		CustomerDTO  customer=getCustomerById(customerId);
		int pid=customer.getProductId();
		restTemplate.delete("http://localhost:8080/api/products/get/");
		return "record deleted ";
	}

}
