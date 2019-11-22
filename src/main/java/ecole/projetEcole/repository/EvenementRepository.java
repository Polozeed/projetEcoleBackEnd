package ecole.projetEcole.repository;

import ecole.projetEcole.entity.EvenementEntity;
import org.springframework.data.repository.CrudRepository;

public interface EvenementRepository extends CrudRepository<EvenementEntity, Integer> {
}
