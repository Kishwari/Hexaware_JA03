package com.hexaware.springboot1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hexaware.springboot1.entity.Product;

@Service
public class ProductServiceImp implements IProductService {

	@Override
	public boolean createProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProductById(int pid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Product selectProductById(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> selectAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

}
