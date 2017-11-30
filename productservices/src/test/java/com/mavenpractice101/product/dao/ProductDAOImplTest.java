package com.mavenpractice101.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mavenpractice101.product.dto.*;

public class ProductDAOImplTest {

	@Test
	public void testCreateProduct() {
		
		IProductDAO dao = new ProductDAOImpl();
		
		Product product = new Product();
		product.setId(1);
		product.setName("ASUS");
		product.setDesc("Not a bad phone!");
		product.setPrice(250);
		
		dao.create(product);
		Product result = dao.read(1);
		
		assertNotNull(result);
		assertEquals("ASUS", result.getName());
	}

}
