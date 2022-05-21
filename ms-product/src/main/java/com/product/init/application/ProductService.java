package com.product.init.application;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.init.domain.Product;
import com.product.init.domain.ProductRepository;
import com.product.init.infraestructure.ProductServiceI;

@Service
public class ProductService implements ProductServiceI {

	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public Product create(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product update(Product product) {
		Optional<Product> optionalProduct = productRepository.findById(product.getProd_id());

		if (!optionalProduct.isPresent()) {
			throw new RuntimeException("No se encontro el producto a actualizar");
		}

		Product prod = optionalProduct.get();
		prod.setProd_est("A");

		return productRepository.save(product);
	}

	@Override
	public void delete(Product product) {
		Optional<Product> optionalProduct = productRepository.findById(product.getProd_id());

		if (!optionalProduct.isPresent()) {
			throw new RuntimeException("No se encontro el producto a actualizar");
		}
		
		Product prod = optionalProduct.get();
	}
}