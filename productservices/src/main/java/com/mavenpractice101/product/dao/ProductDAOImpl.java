package com.mavenpractice101.product.dao;

import java.util.*;

import com.mavenpractice101.product.dto.Product;

public class ProductDAOImpl implements IProductDAO{

	Map<Integer, Product> products = new HashMap<>();
	
	
	@Override
	public void create(Product product) {
		// TODO Auto-generated method stub
		products.put(product.getId(), product);
		
	}
	
	@Override
	public Product read(int id){
		// TODO Auto-generated method stub
		return products.get(id);
	}
	
	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	
}
