package spring.framework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.framework.petclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
