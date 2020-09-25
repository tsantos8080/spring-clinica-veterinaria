package br.tsantos8080.clinicaveterinaria.services;

import br.tsantos8080.clinicaveterinaria.models.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
