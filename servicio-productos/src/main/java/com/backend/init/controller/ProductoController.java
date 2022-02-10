package com.backend.init.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.backend.init.models.entity.Producto;
import com.backend.init.models.service.IProductoService;

@RestController
public class ProductoController {

	@Value("${server.port}")
	private Integer port;
	
	@Autowired
	private IProductoService prodServ;
	
	// Método de listar
	@GetMapping("/listar")
	public List<Producto> listar() {
		return prodServ.findAll().stream().map(prod -> {
			prod.setPort(port);
			return prod;
		}).collect(Collectors.toList());
	}
	
	// Método de listar 1 producto por Id
	public Producto listarById(@PathVariable Long id) {
		Producto prod = prodServ.findById(id);
		prod.setPort(port);
		return prod;
	}
}