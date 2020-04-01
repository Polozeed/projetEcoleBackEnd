package ecole.projetEcole.repository;

import ecole.projetEcole.entity.CollaborateurEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollaborateurRepository extends CrudRepository<CollaborateurEntity, Integer> {


    CollaborateurEntity findByNom(String nom);



}
