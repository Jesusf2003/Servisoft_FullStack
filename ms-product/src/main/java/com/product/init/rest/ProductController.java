package com.product.init.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.init.application.ProductService;
import com.product.init.domain.Product;

@RestController
@RequestMapping("/ms-product/v1/products")
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping
	public List<Product> findAll() {
		return productService.findAll();
	}

	@PostMapping
	public Product create(@RequestBody Product product) {
		return productService.create(product);
	}

	@PutMapping("/{id}")
	public Product update(@RequestBody Product product) {
		return productService.update(product);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id, @RequestBody Product product) {
		productService.delete(product);
	}
}