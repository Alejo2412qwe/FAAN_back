package com.proyecto.faan.repository;

import com.proyecto.faan.model.Alergias;
import com.proyecto.faan.model.Animal;
import com.proyecto.faan.repository.generic.GenericRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends GenericRepository<Animal,Integer> {
    public Page<Animal> findByNombreAnimalOrPlacaAnimal(String nameA, String placaA, Pageable pageable);
}
