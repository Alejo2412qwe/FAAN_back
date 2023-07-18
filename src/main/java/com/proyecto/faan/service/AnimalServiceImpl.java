package com.proyecto.faan.service;

import com.proyecto.faan.model.Alergias;
import com.proyecto.faan.model.Animal;
import com.proyecto.faan.repository.AlergiasRepository;
import com.proyecto.faan.repository.AnimalRepository;
import com.proyecto.faan.repository.generic.GenericRepository;
import com.proyecto.faan.service.generic.GenericServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class AnimalServiceImpl extends GenericServiceImpl<Animal, Integer> implements AnimalService{
    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public GenericRepository<Animal, Integer> getDao() {
        return animalRepository;
    }

    @Override
    public Page<Animal> findByNombreAnimalOrPlacaAnimal(String filter, Pageable pageable) {
        return animalRepository.findByNombreAnimalOrPlacaAnimal(filter, filter, pageable);
    }
}