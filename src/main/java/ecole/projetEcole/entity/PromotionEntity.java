package ecole.projetEcole.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "promotion", schema = "projetecole", catalog = "")
public class PromotionEntity {

    @Id
    @Column(name = "id_promotion")
    private int idPromotion;

    @Column(name = "nom_promotion")
    private String nomPromotion;

    @Column(name = "intitule")
    private String intitule;

    @Column(name = "id_formation")

    @OneToMany
    private List<FormationEntity> formationEntity;


}
