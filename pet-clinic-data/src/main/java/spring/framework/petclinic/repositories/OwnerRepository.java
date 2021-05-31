package spring.framework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.framework.petclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
