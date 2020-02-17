package ecole.projetEcole.dto.ecole;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Data
public class FormationDto implements Serializable {


    private String intitule;
    private int dureeEtude;
    private DiplomeDto diplome;
    private List<PromotionDto> promotionList;
    private Set<EcoleDto> ecoles;

    public FormationDto(){

    }

    public FormationDto(String intitule, int dureeEtude, DiplomeDto diplome, List<PromotionDto> promotionList, Set<EcoleDto> ecoles) {
        this.intitule = intitule;
        this.dureeEtude = dureeEtude;
        this.diplome = diplome;
        this.promotionList = promotionList;
        this.ecoles = ecoles;
    }
}
