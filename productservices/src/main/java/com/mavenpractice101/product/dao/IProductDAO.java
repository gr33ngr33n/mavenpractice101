package com.mavenpractice101.product.dao;

import com.mavenpractice101.product.dto.*;

public interface IProductDAO {
	
	void create (Product product);
	
	Product read (int id);
	
	void update (Product product);
	
	void delete (int id);

}
