package br.tsantos8080.clinicaveterinaria.services;

import br.tsantos8080.clinicaveterinaria.models.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
