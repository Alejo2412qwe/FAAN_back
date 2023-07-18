package com.proyecto.faan.service;

import com.proyecto.faan.model.Alergias;
import com.proyecto.faan.model.Animal;
import com.proyecto.faan.service.generic.GenericService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AnimalService extends GenericService<Animal, Integer> {
    public Page<Animal> findByNombreAnimalOrPlacaAnimal(String filter, Pageable pageable);

}
