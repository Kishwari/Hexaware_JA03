package com.hexaware.springjdbc.service;

import java.util.List;

import com.hexaware.springjdbc.model.Product;

public interface IProductService {

	public boolean createProduct(Product product);
	public boolean updateProduct(Product product);
	
	public boolean deleteProductById(int pid);
	public Product selectProductById(int productId);

	public List<Product> selectAllProducts();
}
