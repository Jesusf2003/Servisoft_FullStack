package com.springboot.servisoft.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import com.springboot.servisoft.exception.NotFoundException;
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
    @GetMapping
    public ResponseEntity<List<Persona>> getAllPer() {
        return ResponseEntity.ok(perser.findAll());
    }

    // Registrar
    @PostMapping
    public ResponseEntity<Persona> savePersona(@RequestBody Persona per) throws URISyntaxException {
        Persona perSaved = perser.save(per);
        return ResponseEntity.created(new URI("/persona/" + perSaved.getCodper())).body(perSaved);
    }

    // Modificar
    @PutMapping
    public ResponseEntity<Persona> updatePersona(@RequestBody Persona per) {
        return ResponseEntity.ok(perser.save(per));
    }

    // Eliminar
    @DeleteMapping("/{id}")
    public ResponseEntity<Persona> deletPersona(@PathVariable Long id) {
        return perser.findById(id).map(persona -> {
            persona.setEstper("I");
            return ResponseEntity.ok(perser.save(persona));
        }).orElseThrow(() -> new NotFoundException("No se encontró el registro"));
    }
}