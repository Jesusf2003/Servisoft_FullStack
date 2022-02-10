package com.springboot.servisoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.servisoft.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{
}