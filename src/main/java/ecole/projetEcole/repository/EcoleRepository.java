package ecole.projetEcole.repository;

import ecole.projetEcole.entity.EcoleEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EcoleRepository extends CrudRepository<EcoleEntity, Integer> {



    List<EcoleEntity> findAll();

    List<EcoleEntity> findByNom(String nom);

    List<EcoleEntity> findByIdEcole(String nom);

    EcoleEntity getByIdEcole(int idEcole);

   @Query(value = " SELECT  `ecole`.* "+
    "FROM `adresse` "+
    "LEFT JOIN `ecole` ON `ecole`.`id_adresse` = `adresse`.`id_adresse`"+
    "WHERE `adresse`.`nom_rue`  LIKE '%' :recherche '%' OR `adresse`.`nom_ville`  LIKE '%' :recherche '%' OR " +
           "`adresse`.`departement`  LIKE  '%' :recherche '%' OR `adresse`.`pays`  LIKE '%' :recherche '%' ;", nativeQuery = true)
    List<EcoleEntity> findByAdresseEntity(@Param("recherche") String recherche);

    @Query(value = "SELECT  `ecole`.*\n" +
            "FROM `formation`\n" +
            "         LEFT JOIN `formation_ecole` ON `formation_ecole`.`id_formation` = `formation`.`id`\n" +
            "         LEFT JOIN `ecole` ON `formation_ecole`.`id_ecole` = `ecole`.`id_ecole`\n" +
            "WHERE `formation`.`intitule` LIKE '%' :recherche '%';", nativeQuery = true)
    List<EcoleEntity> findByFormationEntity(@Param("recherche") String recherche);

    @Query(value = "SELECT  `ecole`.*\n" +
            "FROM `formation`\n" +
            "         LEFT JOIN `formation_ecole` ON `formation_ecole`.`id_formation` = `formation`.`id`\n" +
            "         LEFT JOIN `ecole` ON `formation_ecole`.`id_ecole` = `ecole`.`id_ecole`\n" +
            "WHERE `formation`.`duree_etude` LIKE '%' :recherche '%';", nativeQuery = true)
    List<EcoleEntity> findByNvEtude(@Param("recherche") String recherche);
}
