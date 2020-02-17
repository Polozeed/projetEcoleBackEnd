package ecole.projetEcole.repository;

import ecole.projetEcole.entity.AdresseEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AdresseRepository extends CrudRepository<AdresseEntity, Integer> {

    List<AdresseEntity> findByNomRueContainsOrNomVilleContains(String adresse,String adresse2);
}
