package com.hexaware.springboot1.dao;

import java.util.List;

import com.hexaware.springboot1.entity.Product;

public interface IProductDao {

	public boolean  createProduct(Product product);
	public boolean   updateProduct(Product product);
	
	public boolean  deleteProductById(int productId);
	
	public Product  selectProductById(int productId);
	
	public  List<Product>  selectAllProducts();
}
