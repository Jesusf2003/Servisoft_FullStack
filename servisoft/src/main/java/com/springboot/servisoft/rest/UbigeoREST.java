package com.springboot.servisoft.rest;

import java.util.List;

import com.springboot.servisoft.model.Ubigeo;
import com.springboot.servisoft.service.UbigeoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/ubigeo")
public class UbigeoREST {

    @Autowired
    private UbigeoService ubiserv;

    // Listar
    @GetMapping
    private ResponseEntity<List<Ubigeo>> getAllUbi() {
        return ResponseEntity.ok(ubiserv.findAll());
    }
}