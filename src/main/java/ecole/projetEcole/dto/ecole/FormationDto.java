package ecole.projetEcole.dto.ecole;

import lombok.*;

import java.io.Serializable;
import java.util.List;
@Data
public class FormationDto implements Serializable {


    private String intitule;
    private int dureeEtude;
    private DiplomeDto diplome;
    private List<PromotionDto> promotionList;

    public FormationDto(){

    }

    public FormationDto(String intitule, int anneeEtude, DiplomeDto diplome, List<PromotionDto> promotionList) {
        this.intitule = intitule;
        this.dureeEtude = anneeEtude;
        this.diplome = diplome;
        this.promotionList = promotionList;
    }

}
