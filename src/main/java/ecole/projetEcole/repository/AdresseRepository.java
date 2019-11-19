package ecole.projetEcole.repository;

import ecole.projetEcole.dao.AdresseEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AdresseRepository extends CrudRepository<AdresseEntity, Integer> {
}