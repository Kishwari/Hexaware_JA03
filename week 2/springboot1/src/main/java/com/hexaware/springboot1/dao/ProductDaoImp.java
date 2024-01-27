package com.hexaware.springboot1.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.hexaware.springboot1.entity.Product;


@Repository
public class ProductDaoImp implements IProductDao {

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
	public boolean deleteProductById(int productId) {
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