package com.product.init.infraestructure;

import java.util.List;

import com.product.init.domain.Product;

public interface ProductServiceI {
	
	List<Product> findAll();
	
	Product create(Product product);
	
	Product update(Product product);
	
	void delete(Long id);
}