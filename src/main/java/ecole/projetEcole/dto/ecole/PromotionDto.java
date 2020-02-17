package ecole.projetEcole.dto.ecole;

import lombok.Data;

import java.io.Serializable;


@Data
public class PromotionDto implements Serializable {

    private int idPromotion;
    private String intitule;
    private String nomPromotion;
    private int idFormation;
}
