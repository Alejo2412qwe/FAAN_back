package com.proyecto.faan.repository;

import com.proyecto.faan.model.Persona;
import com.proyecto.faan.repository.generic.GenericRepository;
import com.proyecto.faan.service.PersonaServiceImpl;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends GenericRepository<Persona, Integer> {
}
