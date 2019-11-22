package ecole.projetEcole.repository;

import ecole.projetEcole.entity.PersonneEntity;
import org.springframework.data.repository.CrudRepository;

public interface PersonneRepository extends CrudRepository<PersonneEntity, Integer> {
}
