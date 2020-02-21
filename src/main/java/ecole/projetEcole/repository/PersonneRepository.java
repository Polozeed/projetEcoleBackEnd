package ecole.projetEcole.repository;

import ecole.projetEcole.entity.CollaborateurEntity;
import ecole.projetEcole.entity.ContactEntity;
import ecole.projetEcole.entity.PersonneEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PersonneRepository extends CrudRepository<PersonneEntity, Integer> {

        List<CollaborateurEntity> findCollaborateurByIdPersonne(int id);

        List<PersonneEntity> findAll();

        List<ContactEntity> findContactByIdPersonne(int id);

        List<ContactEntity> findContactByPrenomOrNom(String nom, String prenom);

        List<CollaborateurEntity> findCollaborateurByPrenomOrNom(String nom, String prenom);

        @Query(value ="SELECT `personne`.`*`\n" +
                "FROM `formation`\n" +
                "         LEFT JOIN `personne` ON `personne`.`id_formation` = `formation`.`id`\n" +
                "WHERE `formation`.`intitule` LIKE '%' :recherche '%';",nativeQuery = true)
        List<PersonneEntity> findByIntituleFormation(@Param("recherche") String recherche);

        @Query(value = "SELECT * FROM `personne` LIMIT   :limit  OFFSET :offset ;", nativeQuery = true)
        List<PersonneEntity> findAllByPage(@Param("limit") int limit, @Param("offset") int offset );




}
