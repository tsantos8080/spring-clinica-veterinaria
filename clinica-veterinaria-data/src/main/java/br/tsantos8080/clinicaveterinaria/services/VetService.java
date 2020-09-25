package br.tsantos8080.clinicaveterinaria.services;

import br.tsantos8080.clinicaveterinaria.models.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
