package ecole.projetEcole.dto.event;

import ecole.projetEcole.dto.AdresseDto;
import ecole.projetEcole.dto.ecole.EcoleDto;
import ecole.projetEcole.dto.ecole.FormationDto;
import ecole.projetEcole.dto.ecole.PromotionDto;
import lombok.Data;

import java.io.Serializable;


@Data
public class EventEcoleDto extends EvenementDto implements Serializable {


    private EcoleDto ecole;
    private FormationDto formation;
    private PromotionDto promotion;

    public EventEcoleDto(String intitule, AdresseDto lieu, String horaireDebut, String horaireFin, String description, EcoleDto ecole, FormationDto formation, PromotionDto promotion) {
        super(intitule, lieu, horaireDebut, horaireFin, description);
        this.ecole = ecole;
        this.formation = formation;
        this.promotion = promotion;
    }

}
