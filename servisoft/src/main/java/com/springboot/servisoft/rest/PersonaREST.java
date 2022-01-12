package com.springboot.servisoft.rest;

import java.util.List;

import com.springboot.servisoft.model.Persona;
import com.springboot.servisoft.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/persona")
public class PersonaREST {

    @Autowired
    public PersonaService perser;

    // Listar
    @GetMapping(path = "/list")
    public ResponseEntity<List<Persona>> getAllPer() {
        return ResponseEntity.ok(perser.findAll());
    }
}