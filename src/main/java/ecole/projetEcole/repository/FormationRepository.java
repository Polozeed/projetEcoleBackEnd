package ecole.projetEcole.repository;

import ecole.projetEcole.entity.FormationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FormationRepository extends CrudRepository<FormationEntity, Integer> {

    List<FormationEntity> findByIntitule(String nom);
    List<FormationEntity> findByDureeEtude(int duree);


}
