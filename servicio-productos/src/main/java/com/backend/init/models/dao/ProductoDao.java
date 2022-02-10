package com.backend.init.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.init.models.entity.Producto;

public interface ProductoDao extends JpaRepository<Producto, Long> {

}