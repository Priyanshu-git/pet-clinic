package spring.framework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.framework.petclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
