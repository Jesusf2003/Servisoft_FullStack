package com.springboot.servisoft.repository;

import com.springboot.servisoft.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}