package com.proyecto.faan.repository;

import com.proyecto.faan.model.ExamenFisico;
import com.proyecto.faan.repository.generic.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamenFisicoRepository extends GenericRepository<ExamenFisico,Integer> {
}
