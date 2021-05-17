package spring.framework.petclinic.services;

import spring.framework.petclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet Pet);

    Set<Pet> findAll();
}
