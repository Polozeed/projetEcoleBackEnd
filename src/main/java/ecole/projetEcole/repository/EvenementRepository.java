package ecole.projetEcole.repository;

import ecole.projetEcole.entity.EvenementEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EvenementRepository extends CrudRepository<EvenementEntity, Integer> {



    List<EvenementEntity> findByIntitule(String intitule);

    List<EvenementEntity> findByHoraireDebutContainsOrHoraireFinContains(String dateD,String dateF);

    @Query(value = "SELECT * FROM `evenement` LIMIT   :limit  OFFSET :offset ;", nativeQuery = true)
    List<EvenementEntity> findAllByPage(@Param("limit") int limit,@Param("offset") int offset );

    @Query(value = "SELECT COUNT(*) as count FROM `evenement` GROUP BY intitule ORDER BY count DESC;", nativeQuery = true)
    List<Integer> findNbOccurenceEvent();

}
