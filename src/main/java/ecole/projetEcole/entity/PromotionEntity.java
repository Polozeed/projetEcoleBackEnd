package ecole.projetEcole.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "promotion", schema = "Projet_Ecole", catalog = "")
public class PromotionEntity {


    @Id
    @Column(name = "id_promotion")
    private int idPromotion;

    @Column(name = "nom_promotion")
    private String nomPromotion;

    @Column(name = "intitule")
    private String intitule;

    @Column(name = "id_formation")
    private int idFormation;


}
