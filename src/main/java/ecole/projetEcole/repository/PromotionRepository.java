package ecole.projetEcole.repository;

import ecole.projetEcole.entity.PromotionEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PromotionRepository extends CrudRepository<PromotionEntity, Integer> {
}
