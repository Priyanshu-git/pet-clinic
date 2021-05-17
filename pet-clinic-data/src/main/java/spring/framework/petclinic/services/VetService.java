package spring.framework.petclinic.services;

import spring.framework.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet Vet);

    Set<Vet> findAll();
}
