package br.tsantos8080.clinicaveterinaria.services;

import br.tsantos8080.clinicaveterinaria.models.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
