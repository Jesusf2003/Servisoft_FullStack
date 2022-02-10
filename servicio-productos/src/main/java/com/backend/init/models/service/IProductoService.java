package com.backend.init.models.service;

import java.util.List;

import com.backend.init.models.entity.Producto;

public interface IProductoService {
	
	public List<Producto> findAll();
	public Producto findById(Long id);
}