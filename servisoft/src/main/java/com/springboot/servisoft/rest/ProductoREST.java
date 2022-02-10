package com.springboot.servisoft.rest;

import java.util.List;

import com.springboot.servisoft.model.Producto;
import com.springboot.servisoft.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/producto")
public class ProductoREST {

    @Autowired
    public ProductoService prodser;

    @GetMapping
    public ResponseEntity<List<Producto>> getAllProd() {
        return ResponseEntity.ok(prodser.findAll());
    }
}