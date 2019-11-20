package ecole.projetEcole.repository;

import ecole.projetEcole.entity.EcoleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EcoleRepository extends CrudRepository<EcoleEntity, Integer> {
}
