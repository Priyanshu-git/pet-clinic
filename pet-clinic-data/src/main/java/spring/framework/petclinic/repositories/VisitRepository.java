package spring.framework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.framework.petclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
