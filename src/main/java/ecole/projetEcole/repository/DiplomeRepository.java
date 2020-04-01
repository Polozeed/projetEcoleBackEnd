package ecole.projetEcole.repository;

import ecole.projetEcole.entity.DiplomeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DiplomeRepository extends CrudRepository<DiplomeEntity, Integer> {

    List<DiplomeEntity> findByNomDiplome(String nom);
}
